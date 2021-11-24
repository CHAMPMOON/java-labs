package Model.Storage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import Model.AnimalsPack.AnimalsFactory;
import Model.AviaryPack.*;

public class Database extends Storage
{
    public static void saveData() 
    {
        try 
        {
            FileOutputStream out = new FileOutputStream(Path.of(filename).toFile());
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(listAviary);
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static void loadData() 
    {
        try 
        {
            FileInputStream in = new FileInputStream(Path.of(filename).toFile());
            ObjectInputStream objIn = new ObjectInputStream(in);
            listAviary = (ArrayList<Aviary>) objIn.readObject();

            isLoaded = true;
        } 
        catch (IOException | ClassNotFoundException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean getIsLoaded() 
    {
        return isLoaded;
    }

    public static void loadDataT() 
    {
        try(FileReader reader = new FileReader("Database.txt"))
        {
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
                    listAviary.add(newAviary);
                    ind += 1;
                }
                else
                {
                    listAviary.get(ind).move(
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
            
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // public static void createAnimal(String name, double weight, int year, int type) 
    // {
    //     listAnimalsUser.add(AnimalsFactory.createAnimalsFactory(name, weight, year, type));
    // }

    // public static void createAviary(String name, int type) {
    //     listAviaryUser.add(AviaryFactory.createAviaryFactory(name, type));
    // }

    // public static void moveAnimal(int indexAnimal, int indexAviary) {
    //     listAviaryUser.get(indexAviary).move(listAnimalsUser.get(indexAnimal));
    // }

    // public static String toStringListAnimals(ArrayList<Animals> listAnimals, boolean inAviary) {
    //     String result = "";

    //     for (int i = 0; i < listAnimals.size(); i++) {
    //         result += (i + 1) + ") " + listAnimals.get(i).toString(inAviary);
    //     }
    //     return result;
    // }

    // public static String toStringListAviary() {
    //     String result = "";
    //     boolean load = false;

    //     for (int i = 0; i < listAviaryUser.size(); i++) {
    //         result += (i + 1) + ") " + listAviaryUser.get(i).toString(load);
    //     }
    //     return result;
    // }

    // public static void deleteAnimals(ArrayList<Animals> listAnimals, int index) {
    //     listAnimals.remove(index);
    // }

    // public static String seeAll() {
    //     String result = "";
    //     String empty = "Empty";

    //     boolean load = false;

    //     for (int i = 0; i < listAviaryUser.size(); i++) {
    //         result += (i + 1) + ") " + listAviaryUser.get(i).toString(load) + listAviaryUser.get(i).seeAnimals();
    //     }

    //     if (result == "") {
    //         return empty;
    //     }

    //     return result;
    // }
}