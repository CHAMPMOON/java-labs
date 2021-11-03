package Model.AviaryPack;

import Model.AviaryPack.AviaryChildClasses.*;


public class AviaryFactory
{
    public static Aviary CreateAviaryFactory(int type, String name)
    {
        Aviary aviary = null;
        
        switch (type)
        {
            case 1:
                aviary = new NettyAviary(TypeAviary.NETTY, name);
                break;

            case 2:
                aviary = new OpenAviary(TypeAviary.OPEN, name);
                break;

            case 3:
                aviary = new WarmAviary(TypeAviary.WARM, name);
                break;

            case 4:
                aviary = new WaterAviary(TypeAviary.WATER, name);
                break;
        }

        return aviary;
    }
}
