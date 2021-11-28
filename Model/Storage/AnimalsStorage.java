package Model.Storage;

import java.util.ArrayList;

import Model.Animals.*;

public class AnimalsStorage extends Storage
{
    public static ArrayList<Animals> getListAnimals()
    {
        return listAnimals;
    }

    public static String deleteAnimals(int index, ArrayList<Animals> list) 
    {
        list.remove(index);
        return deleteMessage;
    }

    public static String createAnimal(String name, double weight, int year, int type) 
    {
        try
        {
            listAnimals.add(AnimalsFactory.createAnimalsFactory(name, weight, year, type));
            return createMessage;
        }
        catch(Exception ex)
        {
            return errorMessage;
        }
    }

    public static String moveAnimal(int indexAnimal, int indexAviary) 
    {
        try
        {
            listAviary.get(indexAviary).move(listAnimals.get(indexAnimal));
            listAnimals.remove(indexAnimal);

            return moveMessage;
        }
        catch(ClassCastException ex)
        {
            return errMoveMessage;
        }
    }

    public static String toStringListAnimals(ArrayList<Animals> list) 
    {
        String result = "";
        
        for (int i = 0; i < list.size(); i++) 
        {
            result += (i + 1) + ") " + list.get(i).toString();
        }
        
        if (result == "") 
        {
            return empty;
        }
        return result;
    }
}
