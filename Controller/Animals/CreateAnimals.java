package Controller.Animals;

import java.util.logging.Level;

import Controller.Common.*;
import Model.Storage.AnimalsStorage;
import View.*;
import utils.ForLogs;

public class CreateAnimals 
{
    public static void run()
    {
        String name = EntryName.run();
        double weight = EntryDouble.run(6);
        int year = EntryInt.run(4);
        int type = EntryInt.run(5) - 1;

        
        CommonView.clearScreen();
        try
        {
            System.out.println(AnimalsStorage.createAnimal(name, weight, year, type));
            ForLogs.createLog(Level.INFO, "Create animal: " + name + " " + weight + " " + year + " " + "type - " + type);
        }
        catch(IndexOutOfBoundsException ex)
        {
            AnimalsView.showAnimalsMessage(0);
            ForLogs.addErrWithLog(ex);
        }
    }
}
