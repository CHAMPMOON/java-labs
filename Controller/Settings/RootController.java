package Controller.Settings;

import java.io.IOException;
import java.util.Scanner;

import View.*;
import utils.*;

public class RootController 
{
    public static void run(User user)
    {
        CommonView.clearScreen();
    
        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);
    
        while (true)
        { 
            SettingsView.showSettingsMessage(4);
            System.out.print(SettingsView.getRootMenu(
                user.getDebug(),
                user.getTest()
            ));
            String cs = in.nextLine();
    
            switch(cs)
            {
                case "1":
                    CommonView.clearScreen();    
                    user.changeDebug();
                    break;
                
                case "2":
                    CommonView.clearScreen();
                    user.changeTest();
                    break;
                
                case "3":
                    try 
                    {
                        user.saveInConfig();
                    }
                    catch(IOException ex)
                    {
                        SettingsView.showSettingsMessage(6);
                    }
                    return;

                default:
                    CommonView.clearScreen();
                    SettingsView.showSettingsMessage(5);
            }
        }
    }
}
