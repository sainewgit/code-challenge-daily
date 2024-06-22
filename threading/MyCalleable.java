package threading;

import java.util.concurrent.Callable;

public class MyCalleable implements Callable {

    @Override
    public Object call() throws Exception {
        return 1;
    }
}
