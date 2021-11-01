package AviaryPackage;

public class OpenAviary extends Aviary
{

    @Override
    public void SeeAnimals() {
        System.out.println("\n\tOpenAviary:");
        for (int i = 0; i < livingAnimals.size(); i++)
            System.out.print(i + 1 + ") " + livingAnimals.get(i).toString() + "\n");
    }

    @Override
    public TypeAviary GetType() 
    {
        return TypeAviary.OPEN;
    }
}
