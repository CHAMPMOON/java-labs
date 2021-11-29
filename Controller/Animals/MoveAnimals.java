package Controller.Animals;

import java.util.ArrayList;
import java.util.logging.Level;

import Controller.Common.*;
import Model.Animals.Animals;
import Model.Storage.*;
import View.*;
import utils.ForLogs;

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
    
            try
            {
                System.out.println(AnimalsStorage.moveAnimal(indexAnimal, indexAviary));
                ForLogs.createLog(Level.INFO, "Move animal with index - " + indexAnimal + " in aviary with index - " + indexAviary);
            }
            catch(ClassCastException ex)
            {
                AnimalsView.showAnimalsMessage(3);
                ForLogs.addErrWithLog(ex);
            }
        }
    }
}
