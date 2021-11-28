package Controller;

import java.util.Scanner;

import Controller.Animals.AnimalsController;
import Controller.Aviary.AviaryController;
import Model.Storage.*;
import View.*;

public class AppController 
{
    public static void runApp()
    {
        CommonView.clearScreen();

        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);

        while (true)
        { 
            AppView.showMainMenu();
            String cs = in.nextLine();

            switch(cs)
            {
                case "1":
                    AviaryController.runAviaryBlock();
                    break;

                case "2": 
                    AnimalsController.runAnimalsBlock();
                    break;

                case "3": 
                    CommonView.clearScreen();
                    System.out.println(AviaryStorage.seeAll());
                    break;
                
                case "4": 
                    CommonView.clearScreen();
                    AppController.logicLoaded();
                    break;

                case "5": 
                    CommonView.clearScreen();
                    Database.saveData();
                    AppView.showAppMessage(2);
                    break;
                
                case "6": 
                    return;
                
                default:
                    CommonView.clearScreen();
                    AppView.showAppMessage(3);
            }
        }
    }

    public static void logicLoaded()
    {
        if (Database.getIsLoaded())
        {
            AppView.showAppMessage(0);
        }
        else
        {
            Database.loadData();
            AppView.showAppMessage(1);
        }
    }
}
