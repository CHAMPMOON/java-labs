package Model.Storage;

import java.util.ArrayList;

import Model.Animals.*;
import Model.Aviary.*;

public class AviaryStorage extends Storage
{
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

    public static void deleteAviary(int indexAviary)
    {
        listAviary.remove(indexAviary);
    }

    public static String toStringListAviary() 
    {
        String result = "";

        for (int i = 0; i < listAviary.size(); i++) 
        {
            result += (i + 1) + ") " + listAviary.get(i).toString();
        }

        if (result == "") 
        {
            return empty;
        }

        return result;
    }

    public static String seeAll() 
    {
        String result = "";
        String empty = "Empty";

        for (int i = 0; i < listAviary.size(); i++) 
        {
            result += (i + 1) + ") " + listAviary.get(i).toString() + listAviary.get(i).seeAnimals();
        }

        if (result == "") 
        {
            return empty;
        }

        return result;
    }
}   

