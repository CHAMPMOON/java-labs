package Model.AnimalsPack;

public class AnimalsFactory
{
    public static Animals createAnimalsFactory(String name, double weight, int year, int type)
    {
        Animals animal = null;
        
        switch (type)
        {
            case 1:
                animal = new AquaAnimals(name, weight, year, TypeAnimals.AQUATIC);
                break;

            case 2:
                animal = new ColdAnimals(name, weight, year, TypeAnimals.COLDBLOOD);
                break;

            case 3:
                animal = new FeatAnimals(name, weight, year, TypeAnimals.FEATHERED);
                break;

            case 4:
                animal = new UnguAnimals(name, weight, year, TypeAnimals.UNGULATES);
                break;
        }
        
        return animal;
    }

}


