package View;

public class CommonView 
{
    static String[] arrMessages = {
        "Input name: ",
        "Wrong input\n\n",
        "Input number: ",
        "Input type(1 - Water, 2 - Netty, 3 - Open, 4 - Warm): ",
        "Input year: ",
        "Input type(1 - Aqua, 2 - Feat, 3 - Ungu, 4 - Cold): ",
        "Input weight: "
    };

    public static void showCommonMessage(int ind)
    {
        System.out.print(arrMessages[ind]);
    }

    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
