package Controller.Settings;

import java.util.Scanner;

import View.*;
import utils.*;

public class UserController 
{
    public static void run(User user)
    {
        CommonView.clearScreen();
    
        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);
    
        while (true)
        { 
            SettingsView.showSettingsMessage(3);
            System.out.print(SettingsView.getUserMenu());
            String cs = in.nextLine();
    
            switch(cs)
            {   
                case "1":
                    return;

                default:
                    CommonView.clearScreen();
                    SettingsView.showSettingsMessage(5);
            }
        }
    }
}
