package AnimalsPackage;

import AviaryPackage.Aviary;
import AviaryPackage.TypeAviary;

public class FeatheredAnimals extends Animals
{

    public FeatheredAnimals(String name, double weight, int year) 
    {
        super(name, weight, year);
    }

    @Override
    public void Move(Aviary avr) 
    {
        if (avr.GetType() == TypeAviary.NETTY)
            avr.AddAnimal(this);
    }
    
}
