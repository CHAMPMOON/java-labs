package Model.Animals;

import Model.Animals.AnimalsChildClasses.*;

public class AnimalsFactory
{
    public static Animals createAnimalsFactory(String name, double weight, int year, int type) throws IndexOutOfBoundsException
    {
        Animals animal = null;

        AnimalsFactory.dataСhecking(weight, year, type);
        
        switch (type)
        {
            case 0:
                animal = new AquaAnimals(name, weight, year, TypeAnimals.AQUATIC);
                break;

            case 1:
                animal = new FeatAnimals(name, weight, year, TypeAnimals.FEATHERED);
                break;

            case 2:
                animal = new UnguAnimals(name, weight, year, TypeAnimals.UNGULATES);
                break;
                
            case 3:
                animal = new ColdAnimals(name, weight, year, TypeAnimals.COLDBLOOD);
                break;
        }
        return animal;
    }

    public static void dataСhecking(double weight, int year, int type) throws IndexOutOfBoundsException
    {
        if ((weight < 0) || (year < 0) || (type < 0 || type > 3))
        {
            throw new IndexOutOfBoundsException();
        }
    }
}


