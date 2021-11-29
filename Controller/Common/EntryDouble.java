package Controller.Common;

import java.util.Scanner;

import View.CommonView;
import utils.ForLogs;

public class EntryDouble 
{
    public static double run(int indMessage)
    {
        double number;

        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);

        while (true)
        {
            try
            {
                CommonView.showCommonMessage(indMessage);
                number = Double.parseDouble(in.next());

                break;
            }
            catch(Exception ex)
            {
                CommonView.clearScreen();
                CommonView.showCommonMessage(1);
                ForLogs.addErrWithLog(ex);
            }
        }
        return number;
    }       
}
