package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Config
{
	static String configUser = "config/user.ini";

    static String LOGIN;
	static boolean ROOT;
	static String PASSWORD;
	static boolean DEBUG;
	static boolean TEST;

	public Config() throws IOException
	{
        Properties propsUser = new Properties();
		propsUser.load(new FileInputStream(new File(configUser)));

		LOGIN = propsUser.getProperty("LOGIN");
		PASSWORD = propsUser.getProperty("PASSWORD");
        
		ROOT = Boolean.parseBoolean(propsUser.getProperty("ROOT"));
        TEST = Boolean.parseBoolean(propsUser.getProperty("TEST"));
        DEBUG = Boolean.parseBoolean(propsUser.getProperty("DEBUG"));
    }
	
	public void save(boolean isDebug, boolean isTest) throws IOException
	{
		Properties propsSettings = new Properties();

		propsSettings.load(new FileInputStream(new File(configUser)));

		propsSettings.setProperty("DEBUG", String.valueOf(isDebug));
		propsSettings.setProperty("TEST", String.valueOf(isTest));

		FileOutputStream fos = new FileOutputStream(configUser);
		propsSettings.store(fos, null);
	}

	public String getLogin() { return LOGIN; }
	public String getPassword() { return PASSWORD;}
	public boolean getRoot() { return ROOT; }
	public boolean getTest() { return TEST; }
	public boolean getDebug() { return DEBUG; }
}