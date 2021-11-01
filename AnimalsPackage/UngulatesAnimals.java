package AnimalsPackage;

import AviaryPackage.Aviary;
import AviaryPackage.TypeAviary;

public class UngulatesAnimals extends Animals
{

    public UngulatesAnimals(String name, double weight, int year) 
    {
        super(name, weight, year);
    }

    @Override
    public void Move(Aviary avr) 
    {
        if (avr.GetType() == TypeAviary.OPEN)
            avr.AddAnimal(this);
    }
    
}
