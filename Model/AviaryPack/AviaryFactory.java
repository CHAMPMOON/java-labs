package Model.AviaryPack;

public class AviaryFactory extends Aviary
{
    public TypeAviary type;

    AviaryFactory(TypeAviary type)
    {
        super();
        switch (type)
        {
            case WARM:
                this.type = TypeAviary.WARM;
                break;
            case WATER:
                this.type = TypeAviary.WATER;
                break;
            case NETTY:
                this.type = TypeAviary.NETTY;
                break;
            case OPEN:
                this.type = TypeAviary.OPEN;
                break;
        }
    }
}
