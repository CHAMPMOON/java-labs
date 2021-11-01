package AnimalsPackage;

import AviaryPackage.Aviary;
import AviaryPackage.TypeAviary;

public class ColdAnimals extends Animals
{

    public ColdAnimals(String name, double weight, int year) 
    {
        super(name, weight, year);
    }

    @Override
    public void Move(Aviary avr) 
    {
        if (avr.GetType() == TypeAviary.WARM)
            avr.AddAnimal(this);
    }
    
}
