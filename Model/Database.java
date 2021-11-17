package Model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.AnimalsPack.AnimalsFactory;
import Model.AviaryPack.*;

public class Database
{
    static ArrayList<Aviary> listAviary = new ArrayList<Aviary>();

    public static void loadData() 
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
                    listAviary.get(ind).moveAnimal(
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

    public static void saveData(ArrayList<Aviary> listAvr) 
    {
        try(FileWriter writer = new FileWriter("Database.txt"))
        {
            for (int i = 0; i < listAvr.size(); i++)
            {
                writer.write(listAvr.get(i).seeAnimals(true));
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Aviary> getListAviary()
    {
        return listAviary;
    }

}