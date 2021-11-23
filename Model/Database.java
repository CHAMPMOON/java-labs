package Model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.AnimalsPack.*;
import Model.AviaryPack.*;

public class Database
{
    static ArrayList<Aviary> listAviaryUser = new ArrayList<Aviary>();
    static ArrayList<Animals> listAnimalsUser = new ArrayList<Animals>();
    static boolean isLoaded = false;

    public static String loadData() 
    {
        String used = "Already used";
        String notUsed = "Successfully used";


        if (isLoaded)
        {
            return used;
        }

        try(FileReader reader = new FileReader("Database.txt"))
        {
            ArrayList<Aviary> listAviaryDatabase = new ArrayList<Aviary>();
            Scanner scan = new Scanner(reader);
            int ind = -1;
            int type = 0;

            while (scan.hasNextLine()) 
            {
                String[] argList = scan.nextLine().split(" ");
                if (argList.length == 2)
                {
                    type = Integer.parseInt(argList[1]);
                    Aviary newAviary = AviaryFactory.createAviaryFactory(argList[0], type);
                    listAviaryDatabase.add(newAviary);
                    ind += 1;
                }
                else
                {
                    listAviaryDatabase.get(ind).move(
                        AnimalsFactory.createAnimalsFactory(
                            argList[0], 
                            Double.parseDouble(argList[1]),
                            Integer.parseInt(argList[2]),
                            type
                        )
                    );
                }
            }
            scan.close();

            isLoaded = true;
            Database.uniteListsAviary(listAviaryDatabase);
        }
        catch(IOException ex)
        {
            return ex.getMessage();
        }
        return notUsed;
    }

    public static void saveData() 
    {
        try(FileWriter writer = new FileWriter("Database.txt"))
        {
            for (int i = 0; i < listAviaryUser.size(); i++)
            {
                writer.write(listAviaryUser.get(i).writeAnimals());
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean getIsLoaded()
    {
        return isLoaded;
    }

    public static ArrayList<Animals> getListAnimals(int index)
    {
        return listAviaryUser.get(index).getAnimals();
    }

    private static void uniteListsAviary(ArrayList<Aviary> listAviaryDatabase)
    {
        for (int i = 0; i < listAviaryDatabase.size(); i++)
        {
            listAviaryUser.add(
                listAviaryDatabase.get(i)
            );
        }
    }

    public static void createAnimal(String name, double weight, int year, int type)
    {
        listAnimalsUser.add(
            AnimalsFactory.createAnimalsFactory(
                name, weight, year, type
            )
        );
    }

    public static void createAviary(String name, int type)
    {
        listAviaryUser.add(
            AviaryFactory.createAviaryFactory(
                name, type
            )
        );
    } 
    
    public static void moveAnimal(int indexAnimal, int indexAviary)
    {
        listAviaryUser.get(indexAviary).move(
            listAnimalsUser.get(indexAnimal)
        );
    }

    public static String toStringListAnimals(ArrayList<Animals> listAnimals, boolean inAviary)
    {
        String result = "";

        for (int i = 0; i < listAnimals.size(); i++)
        {
            result += (i + 1) + ") " + listAnimals.get(i).toString(inAviary);
        }
        return result;
    }

    public static String toStringListAviary()
    {
        String result = "";
        boolean load = false;

        for (int i = 0; i < listAviaryUser.size(); i++)
        {
            result += (i + 1) + ") " + listAviaryUser.get(i).toString(load);
        }
        return result;
    }

    public static void deleteAnimals(ArrayList<Animals> listAnimals, int index)
    {
        listAnimals.remove(index);
    }

    public static String seeAll()
    {
        String result = "";

        boolean load = false;

        for (int i = 0; i < listAviaryUser.size(); i++)
        {
            result += (i + 1) + ") " + listAviaryUser.get(i).toString(load);
        }
        return result;
    }
}