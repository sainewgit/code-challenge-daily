package lowelevel.desginpattern.creational.singleton;

public class SingloeTone {

    private static SingloeTone instance;

    private SingloeTone()
    {

    }
    public static SingloeTone getInstance() {
        if (instance == null)
        {
            synchronized(SingloeTone.class)
            {
                if (instance==null)
                {
                    return new SingloeTone();
                }
            }

        }
        return instance;
    }
}
