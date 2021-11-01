package Model.AviaryPack;

public class AviaryFactory
{
    public Aviary CreateAviary(TypeAviary type)
    {
        Aviary aviary = null;
        
        switch (type)
        {
            case WARM:
                aviary = new WarmAviary(type);
                break;

            case WATER:
                aviary = new WaterAviary(type);
                break;

            case NETTY:
                aviary = new NettyAviary(type);
                break;

            case OPEN:
                aviary = new OpenAviary(type);
                break;
        }

        return aviary;
    }
}
