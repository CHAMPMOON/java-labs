package Controller.Common;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Animals.Animals;
import Model.Storage.AnimalsStorage;
import View.CommonView;

public class SelectAnimal 
{
    public static int run(ArrayList<Animals> list)
    {
        int numberAnimal;

        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println(AnimalsStorage.toStringListAnimals(list));
            try
            {
                CommonView.showCommonMessage(2);
                numberAnimal = Integer.parseInt(in.next());

                int size = list.size();

                if (numberAnimal > size || numberAnimal <= 0)
                {
                    throw new Exception();
                }

                break;
            }
            catch(Exception ex)
            {
                CommonView.clearScreen();
                CommonView.showCommonMessage(1);
            }
        }
        CommonView.clearScreen();  
        
        return numberAnimal;
    }  
}
