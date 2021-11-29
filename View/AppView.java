package View;

public class AppView 
{
    static String appMenu = (
        "          * * *          \n" +
        "Aviary block............1\n" + 
        "Animals block...........2\n" +
        "See all data............3\n" +
        "Load from database......4\n" +
        "Save in database........5\n" +
        "Exit the program........6\n" +
        "          * * *          \n" +
        "Your answer: "
    );

    static String[] arrMessages = {
        "Already used",
        "Successfully used",
        "Successfully saved",
        "Wrong input", 
        "Something went wrong"
    };

    public static void showMainMenu()
    {
        System.out.print(appMenu);
    } 

    public static void showAppMessage(int ind)
    {
        System.out.println(arrMessages[ind]);
    }
}
