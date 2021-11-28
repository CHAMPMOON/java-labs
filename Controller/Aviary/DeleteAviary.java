package Controller.Aviary;

import Controller.Common.SelectAviary;
import Model.Storage.AviaryStorage;
import View.*;

public class DeleteAviary 
{
    public static void run()
    {
        if (AviaryStorage.getListAviarySize() == 0)
        {
            AviaryView.showAviaryMessage(1);
        }
        else
        {
            int indexAviary = SelectAviary.run() - 1;
            System.out.println(AviaryStorage.deleteAviary(indexAviary));
        }
    }
}