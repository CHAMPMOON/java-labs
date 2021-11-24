package Model.Storage;

import java.util.ArrayList;

import Model.AnimalsPack.*;
import Model.AviaryPack.*;

public abstract class Storage 
{
    static ArrayList<Animals> listAnimals = new ArrayList<Animals>();
    static ArrayList<Aviary> listAviary = new ArrayList<Aviary>();
    static String filename = "database.db";
    static boolean isLoaded = false;
}
