import AviaryPackage.*;  // Пакет с вольерами
import AnimalsPackage.*; // Пакет с животными

public class Main 
{
    public static void main(String[] args) 
    {
        Aquarium aquarium = new Aquarium();
        NetAviary netaviary = new NetAviary();
        
        aquarium.SeeAnimals();
        
        WaterfowlAnimals fish = new WaterfowlAnimals("Fish", 12.3, 1);
        
        fish.Move(aquarium);
        fish.Move(aquarium);
        
        fish.Move(netaviary);

        aquarium.SeeAnimals();
        netaviary.SeeAnimals();
    }
}
