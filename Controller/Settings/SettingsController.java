package Controller.Settings;

import java.io.IOException;
import java.util.Scanner;

import View.*;
import utils.*;

public class SettingsController 
{
    static User user;
    static int numberTests = 1000;

    public static boolean run()
    {
        CommonView.clearScreen();

        try
        {
            SettingsController.authorization();

            if (user.getRoot())
            {
                RootController.run(user);
            }
            else
            {
                UserController.run(user);
            }

            if (user.getTest())
            {
                SettingsController.test();
            }

            return true;
        }
        catch(IOException ex)
        {
            SettingsView.showSettingsMessage(1);
            @SuppressWarnings("resource")
                Scanner in = new Scanner(System.in);
            
            SettingsView.showSettingsMessage(7);
            in.nextLine();
        }
        catch(SecurityException ex)
        {
            CommonView.clearScreen();

            SettingsView.showSettingsMessage(2);
            @SuppressWarnings("resource")
                Scanner in = new Scanner(System.in);
            
            SettingsView.showSettingsMessage(7);
            in.nextLine();
        }
        return false;
    }

    public static void authorization() throws SecurityException, IOException 
    {
        user = new User();
        
        String password;
        int attempts = 3;

        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);

        System.out.println(SettingsView.getWelcome(user.getLogin()));

        while (true)
        {
            try
            {
                SettingsView.showSettingsMessage(0);
                password = in.nextLine();

                if (!password.equals(user.getPassword()))
                {
                    attempts -= 1;
                    throw new SecurityException();
                }
                
                break;
            }
            catch(SecurityException ex)
            {
                if (attempts == 0)
                {
                    throw new SecurityException();
                }
                CommonView.clearScreen();
                System.out.println(SettingsView.getPasswordAttempts(attempts));
            }
        }
    }

    private static void test() 
    {
        CommonView.clearScreen();

        SettingsView.showSettingsMessage(8);
        CollectionTests tests = new CollectionTests();
        try 
        {
            tests.setLogger();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        tests.startTest(numberTests);
        @SuppressWarnings("resource")
                Scanner in = new Scanner(System.in);
            
        SettingsView.showSettingsMessage(7);
        in.nextLine();
    }
}
