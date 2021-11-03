package Model.AviaryPack;

import java.util.ArrayList;
import Model.AnimalsPack.*;


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

    public ArrayList<Animals> getAnimals()
    {
        return this.livingAnimals;
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + " " + this.name;
    }

    public void moveAnimal(Animals animal)
    {
        if (this.type.ordinal() == animal.getType().ordinal()) 
        {
            this.livingAnimals.add(animal);
        }  
    }

    public String seeAnimals()
    {
        String result = "";
        result += this.toString();
        for (int i = 0; i < this.livingAnimals.size(); i++)
        {
            result += this.livingAnimals.get(i).toString();
        }
        return result;
    }
}
