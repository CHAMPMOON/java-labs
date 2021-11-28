package Controller.Animals;

import java.util.Scanner;

import Model.Storage.AnimalsStorage;
import View.*;

public class AnimalsController
{
    public static void runAnimalsBlock()
    {
        CommonView.clearScreen();

        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);

        while (true)
        {
            AnimalsView.showAnimalsMenu();
            String cs = in.nextLine();
            
            switch(cs)
            {
                case "1": 
                    CommonView.clearScreen();
                    System.out.println(AnimalsStorage.toStringListAnimals(
                        AnimalsStorage.getListAnimals()
                    ));
                    break;

                case "2": 
                    CommonView.clearScreen();
                    CreateAnimals.run();
                    break;

                case "3": 
                    CommonView.clearScreen();
                    DeleteAnimals.run();
                    break;
                
                case "4": 
                    CommonView.clearScreen();
                    MoveAnimals.run();
                    break;
                
                case "5": 
                    CommonView.clearScreen();
                    return;

                default:
                    CommonView.clearScreen();
                    AnimalsView.showAnimalsMessage(0);
            }
        }
    }
}