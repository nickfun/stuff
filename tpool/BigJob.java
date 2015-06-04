
import java.util.concurrent.*;

public class BigJob implements Callable<String> {

    public String call() throws Exception {
        int n = ThreadLocalRandom.current().nextInt(500);
        Thread.sleep(1000+n);
        System.out.print("BB");
        return "" + (1000+n);
    }
}
