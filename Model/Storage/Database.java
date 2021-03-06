package Model.Storage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;

import Model.Aviary.*;

public class Database extends Storage
{
    public static void saveData() 
    {
        try 
        {
            FileOutputStream out = new FileOutputStream(Path.of(filename).toFile());
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(listAviary);
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static void loadData() 
    {
        ArrayList<Aviary> loadListAviary = new ArrayList<Aviary>();
        try 
        {
            FileInputStream in = new FileInputStream(Path.of(filename).toFile());
            ObjectInputStream objIn = new ObjectInputStream(in);
            loadListAviary = (ArrayList<Aviary>) objIn.readObject();

            isLoaded = true;
            Database.foldLists(loadListAviary);
        } 
        catch (IOException | ClassNotFoundException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean getIsLoaded() 
    {
        return isLoaded;
    }

    public static void foldLists(ArrayList<Aviary> loadListAviary)
    {
        for (int i = 0; i < loadListAviary.size(); i++)
        {
            listAviary.add(
                loadListAviary.get(i)
            );
        }
    }
}