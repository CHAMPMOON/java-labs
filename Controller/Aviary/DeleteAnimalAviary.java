package Controller.Aviary;

import java.util.ArrayList;

import Controller.Common.*;
import Model.Animals.Animals;
import Model.Storage.*;
import View.*;

public class DeleteAnimalAviary 
{
    public static void run()
    {
        if(AviaryStorage.getListAviarySize() == 0)
        {
            AnimalsView.showAnimalsMessage(2);
        }
        else
        {
            int indexAviary = SelectAviary.run() - 1;

            ArrayList<Animals> list = AviaryStorage.getListAnimals(indexAviary);

            if (list.size() == 0)
            {
                AnimalsView.showAnimalsMessage(1);
            }
            else
            {
                int indexAnimal = SelectAnimal.run(list) - 1;
                System.out.println(AnimalsStorage.deleteAnimals(indexAnimal, list));
            }
        }
    }
}