package AnimalsPackage;

import AviaryPackage.Aviary;

public abstract class Animals 
{
    private String name; // Название животного
    private double weight; // Вес
    private int year; // Возраст

    Animals(String name, double weight, int year)
    {   
        this.name = name;
        this.weight = weight;
        this.year = year;
    }
    
    public String toString()
    {
        return name + " - " + weight + " - " + year;
    }

    // абстрактный метод для расселения животных по вольерам
    public abstract void Move(Aviary avr);

}
