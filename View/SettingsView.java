package View;

public class SettingsView 
{
    static String[] arrMessages = {
        "Input password: ",
        "Incorrect loading of the config\n",
        "Ended up attempts\n",
        "Your role: user\n\n",
        "Your role: root\n\n",
        "Wrong input\n\n", 
        "Something went wrong",
        "Press any button...",
        "<<<<<<<<<<<< TEST >>>>>>>>>>>>\n"
    };
    
    public static void showSettingsMessage(int ind)
    {
        System.out.print(arrMessages[ind]);
    }

    public static String getWelcome(String login)
	{
		return "Welcome, " + login;
	}

	public static String getPasswordAttempts(int number)
	{
		return "Wrong password, attempts left: " + number;
	}

	public static String getRootMenu(boolean isDebug, boolean isTest)
	{
		return "1) Change debug status(" + isDebug + ")\n" + 
			   "2) Change test status(" + isTest + ")\n" +
			   "3) Continue\n\n" + 
			   "Your answer: ";
	}

	public static String getUserMenu()
	{
		return "1) Continue\n\n" +
			   "Your answer: ";
	}

}
