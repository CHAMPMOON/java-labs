package View;

public class AnimalsView 
{
    static String animalsMenu= (
        "          * * *          \n" +
        "See animals.............1\n" + 
        "Create animal...........2\n" +
        "Delete animal...........3\n" +
        "Move animal.............4\n" +
        "Come back...............5\n" + 
        "          * * *          \n" +
        "Your answer: "
    );
    
    static String[] arrMessages = {
        "Wrong input\n",
        "Empty sizes of animals\n",
        "Empty sizes of aviary\n"
    };

    public static void showAnimalsMenu()
    {
        System.out.print(animalsMenu);
    }

    public static void showAnimalsMessage(int ind)
    {
        System.out.print(arrMessages[ind]);
    }
}
