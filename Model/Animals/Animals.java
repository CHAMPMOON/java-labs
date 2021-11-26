package Model.Animals;

import java.io.Serializable;

public abstract class Animals implements Serializable
{
    protected String name;
    protected double weight;
    protected int year;
    protected TypeAnimals type;

    protected Animals(String name, double weight, int year, TypeAnimals type)
    {   
        this.name = name;
        this.weight = weight;
        this.year = year;
        this.type = type;
    }

    public TypeAnimals getType()
    {
        return this.type;
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + " " + this.name + " " + this.weight + " " + this.year + "\n";
    }
}
