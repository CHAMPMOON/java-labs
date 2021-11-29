package utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Model.Aviary.Aviary;
import Model.Aviary.AviaryFactory;

import java.util.Date;

public class CollectionTests 
{
	ArrayList<Aviary> aviaryAL;
	LinkedList<Aviary> aviaryLL;
	private static Logger logger;

    String path = "logs/test";

	public void setLogger() throws IOException 
    {
    	logger = Logger.getLogger(this.getClass().getName());
    	logger.setUseParentHandlers(false);

    	File handlerPath = new File(path);
		handlerPath.createNewFile();

		Handler handler = new FileHandler(path);
		handler.setFormatter(new SimpleFormatter());
	    logger.addHandler(handler);
	}
	public CollectionTests()
    {
		aviaryAL = new ArrayList<>();
		aviaryLL = new LinkedList<>();
	}
	public void startTest(int n) 
    {
		try 
        {
            logger.log(Level.INFO, "**ArrayList test started**" + new Date());
            long startTime, endTime;
            long sumTime = 0;
    
            for(int i = 0; i < n; i++)
            {
                startTime = System.nanoTime();
                aviaryAL.add(AviaryFactory.createAviaryFactory("test" + n, 0));
                endTime = System.nanoTime();
                sumTime += endTime - startTime;
                logger.log(Level.INFO, "add.ID = " + (i + 1) + " Time: " + (endTime - startTime));
            }
            logger.log(Level.INFO, "ArrayList: Add Total Count - " + n);
            System.out.println("ArrayList: Add Total Count - " + n);
    
            logger.log(Level.INFO, "ArrayList: Add Total Time - " + sumTime);
            System.out.println("ArrayList: Add Total Time - " + sumTime);
    
            logger.log(Level.INFO, "ArrayList: Add Median Time - " + (sumTime/n));
            System.out.println("ArrayList: Add Median Time - " + (sumTime/n) + "\n");
            sumTime = 0;
    
            for(int i = 0; i < n/10; i++)
            {
                startTime = System.nanoTime();
                aviaryAL.remove((int)(Math.random()*aviaryAL.size()));
                endTime = System.nanoTime();
                sumTime += endTime - startTime;
                logger.log(Level.INFO, "remove.ID = " + (i + 1) + " Time: " + (endTime - startTime));
            }
            logger.log(Level.INFO, "ArrayList: Remove Total Count - " + (n/10));
            System.out.println("ArrayList: Remove Total Count - " + (n/10));
    
            logger.log(Level.INFO, "ArrayList: Remove Total Time - " + sumTime);
            System.out.println("ArrayList: Remove Total Time - " + sumTime);
    
            logger.log(Level.INFO, "ArrayList: Remove Median Time - " + (sumTime/(n/10)));
            System.out.println("ArrayList: Remove Median Time - " + (sumTime/(n/10)) + "\n");
    
            logger.log(Level.INFO, "**LinkedList test started**" + new Date());
            sumTime = 0;
    
            for(int i = 0; i < n; i++)
            {
                startTime = System.nanoTime();
                aviaryLL.add(AviaryFactory.createAviaryFactory("test" + n, 0));
                endTime = System.nanoTime();
                sumTime += endTime - startTime;
                logger.log(Level.INFO, "add.ID = " + (i + 1) + " Time: " + (endTime - startTime));
            }
            logger.log(Level.INFO, "LinkedList: Add Total Count - " + n);
            System.out.println("LinkedList: Add Total Count - " + n);
    
            logger.log(Level.INFO, "LinkedList: Add Total Time - " + sumTime);
            System.out.println("LinkedList: Add Total Time - " + sumTime);
    
            logger.log(Level.INFO, "LinkedList: Add Median Time - " + (sumTime/n));
            System.out.println("LinkedList: Add Median Time - " + (sumTime/n) + "\n");
            sumTime = 0;
    
            for(int i = 0; i < n/10; i++)
            {
                startTime = System.nanoTime();
                aviaryLL.remove((int)(Math.random()*aviaryAL.size()));
                endTime = System.nanoTime();
                sumTime += endTime - startTime;
                logger.log(Level.INFO, "remove.ID = " + (i + 1) + " Time: " + (endTime - startTime));
            }
            logger.log(Level.INFO, "LinkedList: Remove Total Count - " + (n/10));
            System.out.println("LinkedList: Remove Total Count - " + (n/10));
    
            logger.log(Level.INFO, "LinkedList: Remove Total Time - " + sumTime);
            System.out.println("LinkedList: Remove Total Time - " + sumTime);
    
            logger.log(Level.INFO, "LinkedList: Remove Median Time - " + (sumTime/(n/10)));
            System.out.println("LinkedList: Remove Median Time - " + (sumTime/(n/10)) + "\n");
    
            aviaryLL.clear();
            aviaryAL.clear();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
	}
}