package Controller.Animals;

import java.util.ArrayList;

import Controller.Common.*;
import Model.Animals.Animals;
import Model.Storage.*;
import View.*;

public class MoveAnimals 
{
    public static void run()
    {
        ArrayList<Animals> list = AnimalsStorage.getListAnimals();

        if (list.size() == 0)
        {
            AnimalsView.showAnimalsMessage(1);
        }
        else if(AviaryStorage.getListAviarySize() == 0)
        {
            AnimalsView.showAnimalsMessage(2);
        }
        else
        {
            int indexAnimal = SelectAnimal.run(list) - 1;
            int indexAviary = SelectAviary.run() - 1;
    
            System.out.println(AnimalsStorage.moveAnimal(indexAnimal, indexAviary));
        }
    }
}
