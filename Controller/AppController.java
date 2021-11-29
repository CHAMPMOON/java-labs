package Controller;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

import Controller.Animals.AnimalsController;
import Controller.Aviary.AviaryController;
import Model.Storage.*;
import View.*;
import utils.*;

public class AppController 
{
    static User user;
    static ForLogs logApp;

    public static void runApp()
    {
        AppController.setLogger();

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
                    AppController.logicLoaded();
                    break;

                case "5": 
                    AppController.logicSaved();
                    break;
                
                case "6": 
                    ForLogs.createLog(Level.INFO, "User " + user.getLogin() + " logged out");
                    return;
                
                default:
                    CommonView.clearScreen();
                    AppView.showAppMessage(3);
            }
        }
    }

    private static void setLogger() 
    {
        try 
        {
            user = new User();
            logApp = new ForLogs(user);

            ForLogs.createLog(Level.INFO, "User " + user.getLogin() + " logged in successfully");
        }
        catch(IOException ex)
        {
            ForLogs.addErrWithLog(ex);
        }
    }

    public static void logicLoaded()
    {
        
        CommonView.clearScreen();
        if (Database.getIsLoaded())
        {
            AppView.showAppMessage(0);
        }
        else
        {
            try 
            {
                Database.loadData();
                AppView.showAppMessage(1);

                ForLogs.createLog(Level.INFO, "Successfully loaded into database");
            }
            catch(ClassNotFoundException | IOException ex)
            {   
                ForLogs.addErrWithLog(ex);
                AppView.showAppMessage(4);
            }
        }
    }

    public static void logicSaved()
    {
        CommonView.clearScreen();
        try 
        {
            Database.saveData();
            AppView.showAppMessage(2);

            ForLogs.createLog(Level.INFO, "Successfully saved in database");
        }
        catch(IOException ex)
        {
            ForLogs.addErrWithLog(ex);
            AppView.showAppMessage(4);
        }
    }
}
