package View;

public class AviaryView 
{
    static String aviaryMenu = (
        "          * * *          \n" +
        "See aviary..............1\n" + 
        "Create aviary...........2\n" +
        "Delete aviary...........3\n" +
        "Delete animal...........4\n" +
        "Come back...............5\n" + 
        "          * * *          \n" +
        "Your answer: "
    );

    static String[] arrMessages = { 
        "Wrong input\n",
        "Empty sizes of aviary\n"
    };

    public static void showAviaryMenu()
    {
        System.out.print(aviaryMenu);
    }

    public static void showAviaryMessage(int ind)
    {
        System.out.print(arrMessages[ind]);
    }
}
