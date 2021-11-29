package Controller.Animals;

import java.util.ArrayList;
import java.util.logging.Level;

import Controller.Common.SelectAnimal;
import Model.Animals.Animals;
import Model.Storage.AnimalsStorage;
import View.*;
import utils.ForLogs;

public class DeleteAnimals 
{
    public static void run()
    {
        ArrayList<Animals> list = AnimalsStorage.getListAnimals();

        if (list.size() == 0)
        {
            AnimalsView.showAnimalsMessage(1);
        }
        else
        {
            int indexAnimal = SelectAnimal.run(list) - 1;
            System.out.println(AnimalsStorage.deleteAnimals(indexAnimal, list));
            ForLogs.createLog(Level.INFO, "Delete animal with index - " + indexAnimal);
        }
    }
}
