package utils;

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ForLogs 
{
	private static Vector<Exception> errList;
	public static Logger logger;
	static boolean isDebug; 
	
	String path = "logs/app";

	public ForLogs(User user) throws IOException
    {
		errList = new Vector<>();
		isDebug = user.getDebug();
		setLogger();
	}
	public void setLogger() throws IOException 
    {
    	logger = Logger.getLogger(this.getClass().getName());
    	logger.setUseParentHandlers(false);

    	File handlerPath = new File(path);
		handlerPath.createNewFile();
		Handler handler = new FileHandler(path, true);

		handler.setFormatter(new SimpleFormatter());
	    logger.addHandler(handler);
	}

	public static void createLog(Level lvl, String msg)
	{
		if (isDebug)
		{
			ForLogs.logger.log(lvl, msg);
		}
	}
	
	public static void addErr(Exception e) 
    {
		if (isDebug)
		{
			errList.add(e);
		}
	}
	public static void addErrWithLog(Exception e) 
    {
		if (isDebug)
		{
			errList.add(e);
			logger.log(Level.WARNING, "Exception:", e);
		}
	}
	public static int getErrCount() 
    {
		return errList.size();
	}
	public static void showErrText(Exception e) 
    {
		System.err.println(e.getMessage());
	}	
}