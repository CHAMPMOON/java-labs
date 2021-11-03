package Controller;

import Model.AnimalsPack.*;
import Model.AviaryPack.*;
import java.util.ArrayList;

public class MainController 
{
    public static void moveAnimalInAviary(Animals animal, Aviary aviary)
    {
        TypeAviary typeAviary = aviary.getType();
        TypeAnimals typeAnimals = animal.getType();

        if ((typeAviary == TypeAviary.WATER) && 
            (typeAnimals == TypeAnimals.AQUATIC))
            {
                aviary.addAnimal(animal);
                return;
            }

        if ((typeAviary == TypeAviary.OPEN) && 
            (typeAnimals == TypeAnimals.UNGULATES))
            {
                aviary.addAnimal(animal);
                return;
            }
        
        if ((typeAviary == TypeAviary.WARM) && 
            (typeAnimals == TypeAnimals.COLDBLOOD))
            {
                aviary.addAnimal(animal);
                return;
            }
        
        if ((typeAviary == TypeAviary.NETTY) && 
            (typeAnimals == TypeAnimals.FEATHERED))
            {
                aviary.addAnimal(animal);
                return;
            }
    }

    public static void seeAnimals(Aviary aviary)
    {
        ArrayList<Animals> listAnimal = aviary.getAnimals();

        System.out.println(aviary.toString());
        for (int i = 0; i < listAnimal.size(); i++)
        {
            System.out.println(listAnimal.get(i).toString());
        }
    }

    public static Animals createAnimals(String name, double weight, int year, int type)
    {
        return AnimalsFactory.createAnimalsFactory(name, weight, year, type);
    }

    public static Aviary createAviary(int type, String name)
    {
        return AviaryFactory.CreateAviaryFactory(type, name);
    }
}
