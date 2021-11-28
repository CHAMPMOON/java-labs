package Controller.Common;

import java.util.Scanner;

import View.CommonView;

public class EntryInt 
{
    public static int run(int indMessage)
    {
        int number;

        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);

        while (true)
        {
            try
            {
                CommonView.showCommonMessage(indMessage);
                number = Integer.parseInt(in.next());

                break;
            }
            catch(Exception ex)
            {
                CommonView.clearScreen();
                CommonView.showCommonMessage(1);
            }
        }
        return number;
    }    
}
