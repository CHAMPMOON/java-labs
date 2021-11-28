package Model.Aviary;

import Model.Aviary.AviaryChildClasses.*;


public class AviaryFactory
{
    public static Aviary createAviaryFactory(String name, int type) throws Exception
    {
        Aviary aviary = null;

        AviaryFactory.dataСhecking(type);

        switch (type)
        {
            case 0:
                aviary = new WaterAviary(TypeAviary.WATER, name);
                break;

            case 1:
                aviary = new NettyAviary(TypeAviary.NETTY, name);
                break;

            case 2:
                aviary = new OpenAviary(TypeAviary.OPEN, name);
                break;

            case 3:
                aviary = new WarmAviary(TypeAviary.WARM, name);
                break;
        }
        return aviary;
    }

    public static void dataСhecking(int type) throws Exception
    {
        if (type < 0 || type > 3)
        {
            throw new Exception();
        }
    }
}
