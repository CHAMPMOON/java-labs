package Controller.Common;

import java.util.Scanner;

import Model.Storage.AviaryStorage;
import View.CommonView;

public class SelectAviary 
{
    public static int run()
    {
        int numberAviary;

        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println(AviaryStorage.toStringListAviary());
            try
            {
                CommonView.showCommonMessage(2);
                numberAviary = Integer.parseInt(in.next());
                
                int size = AviaryStorage.getListAviarySize();

                if (numberAviary > size || numberAviary <= 0)
                {
                    throw new Exception();
                }
                break;
            }
            catch(Exception ex)
            {
                CommonView.clearScreen();
                CommonView.showCommonMessage(1);
            }
        }
        CommonView.clearScreen();

        return numberAviary;
    }    
}
