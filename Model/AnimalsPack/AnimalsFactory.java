package Model.AnimalsPack;

public class AnimalsFactory extends Animals
{
    public TypeAnimals type;

    AnimalsFactory(String name, double weight, int year, TypeAnimals type) 
    {
        super(name, weight, year);
        switch (type)
        {
            case COLDBLOOD:
                this.type = TypeAnimals.COLDBLOOD;
                break;
            case AQUATIC:
                this.type = TypeAnimals.AQUATIC;
                break;
            case FEATHERED:
                this.type = TypeAnimals.FEATHERED;
                break;
            case UNGULATES:
                this.type = TypeAnimals.UNGULATES;
                break;
        }
    }
}
