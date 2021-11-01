package Model.AviaryPack;

import java.util.ArrayList;
import Model.AnimalsPack.Animals;

public abstract class Aviary 
{
    protected ArrayList<Animals> livingAnimals = new ArrayList<>();
    TypeAviary type;

    protected Aviary(TypeAviary type)
    {
        this.type = type;
    }

    public TypeAviary getType()
    {
        return this.type;
    }

    public void addAnimal(Animals animal)
    {
        livingAnimals.add(animal);
    }
}
