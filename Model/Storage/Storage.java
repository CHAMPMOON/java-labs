package Model.Storage;

import java.util.ArrayList;

import Model.Animals.*;
import Model.Aviary.*;

public abstract class Storage 
{
    static ArrayList<Animals> listAnimals = new ArrayList<Animals>();
    static ArrayList<Aviary> listAviary = new ArrayList<Aviary>();
    static String errorMessage = "Error: Invalid input";
    static String createMessage = "Successfully created";
    static String errMoveMessage = "Error: type mismatch";
    static String deleteMessage = "Successfully deleted";
    static String moveMessage = "Successfully moved";
    static String filename = "database.db";
    static String empty = "Empty";
    static boolean isLoaded = false;
}
