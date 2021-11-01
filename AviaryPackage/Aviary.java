package AviaryPackage;

import java.util.ArrayList;
import AnimalsPackage.Animals;

public abstract class Aviary
{

    protected ArrayList<Animals> livingAnimals = new ArrayList<>(); // Животные в вольере

    public void AddAnimal(Animals animal)
    {
        livingAnimals.add(animal);
    }

    // абстрактный метод для просмотра животных в вальере
    public abstract void SeeAnimals();

    // абстрактный метод для получения типа вольера
    public abstract TypeAviary GetType();
}


