package AnimalsPackage;

import AviaryPackage.Aviary;
import AviaryPackage.TypeAviary;

public class WaterfowlAnimals extends Animals 
{

    public WaterfowlAnimals(String name, double weight, int year) 
    {
        super(name, weight, year);
    }

    @Override
    public void Move(Aviary avr) 
    {
        if (avr.GetType() == TypeAviary.WATER)
            avr.AddAnimal(this);
    }
    
}
