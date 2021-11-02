package Model.AviaryPack;

public class AviaryFactory
{
    public static Aviary CreateAviaryFactory(int type)
    {
        Aviary aviary = null;
        
        switch (type)
        {
            case 1:
                aviary = new NettyAviary(TypeAviary.NETTY);
                break;

            case 2:
                aviary = new OpenAviary(TypeAviary.OPEN);
                break;

            case 3:
                aviary = new WarmAviary(TypeAviary.WARM);
                break;

            case 4:
                aviary = new WaterAviary(TypeAviary.WATER);
                break;
        }

        return aviary;
    }
}
