package AviaryPackage;

public class Aquarium extends Aviary
{

    @Override
    public void SeeAnimals() 
    {
        System.out.println("\n\tAquarium:");
        int size = livingAnimals.size();
        if (size == 0)
        {
            System.out.print("no animals\n");
        }
        for (int i = 0; i < livingAnimals.size(); i++)
            System.out.print(i + 1 + ") " + livingAnimals.get(i).toString() + "\n");
    }

    @Override
    public TypeAviary GetType() 
    {
        return TypeAviary.WATER;
    }

}
