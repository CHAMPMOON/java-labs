package Model.AviaryPack;

import java.util.ArrayList;
import Model.AnimalsPack.Animals;

public abstract class Aviary 
{
    protected ArrayList<Animals> livingAnimals;

    protected Aviary()
    {
        this.livingAnimals = new ArrayList<>();
    }
}
