package Model.Aviary;

import java.io.Serializable;
import java.util.ArrayList;

import Model.Animals.*;


public abstract class Aviary implements Serializable
{
    private static final long serialVersionUID = 6529685098267757690L;
    
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
        return this.getClass().getSimpleName() + " " + this.name + "\n";
    }

    public void move(Animals animal)
    {
        if (this.type.ordinal() == animal.getType().ordinal()) 
        {
            this.livingAnimals.add(animal);
        }  
    }

    public String writeAnimals()
    {
        String result = "";

        result += this.toString();

        for (int i = 0; i < this.livingAnimals.size(); i++)
        {
            result += this.livingAnimals.get(i).toString();
        }
        return result;
    }

    public String seeAnimals()
    {
        String result = "";

        for (int i = 0; i < this.livingAnimals.size(); i++)
        {
            result += "\t" + (i + 1) + ") " + this.livingAnimals.get(i).toString();
        }
        return result;
    }
}
