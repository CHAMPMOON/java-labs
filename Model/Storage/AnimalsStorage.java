package Model.Storage;

import java.util.ArrayList;

import Model.AnimalsPack.*;

public class AnimalsStorage extends Storage
{
    public static void createAnimal(String name, double weight, int year, int type) 
    {
        listAnimals.add(AnimalsFactory.createAnimalsFactory(name, weight, year, type));
    }

    public static String toStringListAnimals(ArrayList<Animals> listAnml, boolean inAviary) 
    {
        String result = "";

        for (int i = 0; i < listAnml.size(); i++) 
        {
            result += (i + 1) + ") " + listAnml.get(i).toString(inAviary);
        }
        return result;
    }

    public static void deleteAnimals(ArrayList<Animals> listAnml, int index) 
    {
        listAnml.remove(index);
    }
}
