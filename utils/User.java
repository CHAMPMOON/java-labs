package utils;

import java.io.IOException;

public class User 
{
    static boolean isDebug;
    static boolean isTest;
    static boolean isRoot;
    static String login;
    static String password;

	Config config;

    public User() throws IOException
	{ 
		config = new Config();
		
		login = config.getLogin();
		password = config.getPassword();
		isRoot = config.getRoot();
		isDebug = config.getDebug();
		isTest = config.getTest();
	}

    public boolean getDebug(){ return isDebug; }

    public boolean getTest(){ return isTest; }

    public boolean getRoot(){ return isRoot; }

    public String getLogin(){ return login; }

	public String getPassword(){ return password; }
	
	public void changeDebug()
	{
		isDebug = !isDebug;
	}

	public void changeTest()
	{
		isTest = !isTest;
	}

    public void saveInConfig() throws IOException 
	{
		config.save(isDebug, isTest);
    }
}
