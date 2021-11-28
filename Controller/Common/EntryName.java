package Controller.Common;

import java.util.Scanner;

import View.CommonView;

public class EntryName 
{
    public static String run()
    {
        String name;

        @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);

        while (true)
        {
            try
            {
                CommonView.showCommonMessage(0);
                name = in.nextLine();

                if (name.length() == 0)
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
        return name;
    }
}
