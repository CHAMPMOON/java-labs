package Model.Storage;

import java.util.ArrayList;

import Model.AnimalsPack.*;
import Model.AviaryPack.*;

public class AviaryStorage extends Storage
{

    // public static void loadInDatabase()
    // {
    //     // ArrayList<Aviary> data = Database.loadBinary();
    // }

    public static ArrayList<Animals> getListAnimals(int index) 
    {
        return listAviary.get(index).getAnimals();
    }
    
    public static void createAviary(String name, int type) 
    {
        listAviary.add(AviaryFactory.createAviaryFactory(name, type));
    }

    public static void moveAnimal(int indexAnimal, int indexAviary) 
    {
        listAviary.get(indexAviary).move(listAnimals.get(indexAnimal));
        listAnimals.remove(indexAnimal);
    }

    public static String toStringListAviary() 
    {
        String result = "";
        boolean load = false;

        for (int i = 0; i < listAviary.size(); i++) 
        {
            result += (i + 1) + ") " + listAviary.get(i).toString(load);
        }
        return result;
    }

    public static String seeAll() 
    {
        String result = "";
        String empty = "Empty";

        boolean load = false;

        for (int i = 0; i < listAviary.size(); i++) 
        {
            result += (i + 1) + ") " + listAviary.get(i).toString(load) + listAviary.get(i).seeAnimals();
        }

        if (result == "") 
        {
            return empty;
        }

        return result;
    }
}   

