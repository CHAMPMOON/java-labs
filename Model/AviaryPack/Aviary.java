package Model.AviaryPack;

import java.util.ArrayList;
import Model.AnimalsPack.Animals;

public abstract class Aviary 
{
    protected ArrayList<Animals> livingAnimals = new ArrayList<>();
    TypeAviary type;
    String name;

    protected Aviary(TypeAviary type, String name)
    {
        this.type = type;
        this.name = name;
    }

    public TypeAviary getType()
    {
        return this.type;
    }

    public void addAnimal(Animals animal)
    {
        this.livingAnimals.add(animal);
    }

    public ArrayList<Animals> getAnimals()
    {
        return this.livingAnimals;
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + " " + this.name + ":";
    }
}
