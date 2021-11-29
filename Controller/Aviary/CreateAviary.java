package Controller.Aviary;

import java.util.logging.Level;

import Controller.Common.*;
import Model.Storage.AviaryStorage;
import View.*;
import utils.ForLogs;

public class CreateAviary 
{
    public static void run()
    {
        String name = EntryName.run();
        int type = EntryInt.run(3) - 1;

        CommonView.clearScreen();
        try 
        {
            System.out.println(AviaryStorage.createAviary(name, type));
            ForLogs.createLog(Level.INFO, "Create aviary: " + name + " type - " + type);
        }
        catch(IndexOutOfBoundsException ex)
        {
            AviaryView.showAviaryMessage(0);
            ForLogs.addErrWithLog(ex);
        }
    } 
}
