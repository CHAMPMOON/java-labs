import Controller.*;
import Controller.Settings.SettingsController;

public class Main 
{
    public static void main(String[] args) 
    {
        if (SettingsController.run())
        {
            AppController.runApp();
        }
    }
}
