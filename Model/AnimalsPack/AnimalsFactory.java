package Model.AnimalsPack;

public class AnimalsFactory
{
    public Animals createAnimals(String name, double weight, int year, TypeAnimals type)
    {
        Animals animal = null;
        
        switch (type)
        {
            case COLDBLOOD:
                animal = new ColdAnimals(name, weight, year, type);
                break;

            case AQUATIC:
                animal = new AquaAnimals(name, weight, year, type);
                break;

            case FEATHERED:
                animal = new FeatAnimals(name, weight, year, type);
                break;

            case UNGULATES:
                animal = new UnguAnimals(name, weight, year, type);
                break;
        }
        
        return animal;
    }

}


