package Model.AnimalsPack;

public abstract class Animals 
{
    protected String name;
    protected double weight;
    protected int year;

    protected Animals(String name, double weight, int year)
    {   
        this.name = name;
        this.weight = weight;
        this.year = year;
    }
}
