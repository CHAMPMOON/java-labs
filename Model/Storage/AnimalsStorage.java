package Model.Storage;

import java.util.ArrayList;

import Model.Animals.*;

public class AnimalsStorage extends Storage
{
    public static void createAnimal(String name, double weight, int year, int type) 
    {
        listAnimals.add(AnimalsFactory.createAnimalsFactory(name, weight, year, type));
    }

    public static String toStringListAnimals() 
    {
        String result = "";
        
        for (int i = 0; i < listAnimals.size(); i++) 
        {
            result += (i + 1) + ") " + listAnimals.get(i).toString();
        }
        
        if (result == "") 
        {
            return empty;
        }

        return result;
    }

    public static void deleteAnimals(ArrayList<Animals> listAnml, int index) 
    {
        listAnml.remove(index);
    }
}
