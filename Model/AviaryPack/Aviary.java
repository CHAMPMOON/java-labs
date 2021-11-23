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

    public String toString(boolean load)
    {
        if (load)
        {
            return this.name + " " + this.type.ordinal() + "\n";
        }
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

        boolean inAviary = true;
        boolean load = true;

        result += this.toString(load);

        for (int i = 0; i < this.livingAnimals.size(); i++)
        {
            result += this.livingAnimals.get(i).toString(inAviary);
        }
        return result;
    }
}
