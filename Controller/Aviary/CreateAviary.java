package Controller.Aviary;

import Controller.Common.*;
import Model.Storage.AviaryStorage;
import View.*;

public class CreateAviary 
{
    public static void run()
    {
        String name = EntryName.run();
        int type = EntryInt.run(3) - 1;

        CommonView.clearScreen();
        System.out.println(AviaryStorage.createAviary(name, type));
    } 
}
