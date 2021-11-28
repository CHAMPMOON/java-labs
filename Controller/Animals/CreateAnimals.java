package Controller.Animals;

import Controller.Common.*;
import Model.Storage.AnimalsStorage;
import View.*;

public class CreateAnimals 
{
    public static void run()
    {
        String name = EntryName.run();
        double weight = EntryDouble.run(6);
        int year = EntryInt.run(4);
        int type = EntryInt.run(5) - 1;

        
        CommonView.clearScreen();
        System.out.println(AnimalsStorage.createAnimal(name, weight, year, type));
    }
}
