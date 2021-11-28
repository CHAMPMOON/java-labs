package Controller.Aviary;

import java.util.Scanner;

import Model.Storage.AviaryStorage;
import View.*;

public class AviaryController 
{
    public static void runAviaryBlock()
    {
        CommonView.clearScreen();
        
        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);
        
        while (true)
        {
            AviaryView.showAviaryMenu();
            String cs = in.nextLine();
            
            switch(cs)
            {
                case "1": 
                    CommonView.clearScreen();
                    System.out.println(AviaryStorage.toStringListAviary());
                    break;

                case "2": 
                    CommonView.clearScreen();
                    CreateAviary.run();
                    break;

                case "3": 
                    CommonView.clearScreen();
                    DeleteAviary.run();
                    break;

                case "4": 
                    CommonView.clearScreen();
                    DeleteAnimalAviary.run();
                    break;
                
                case "5": 
                    CommonView.clearScreen();
                    return;

                default:
                    CommonView.clearScreen();
                    AviaryView.showAviaryMessage(0);
            }
        }
    } 
}
