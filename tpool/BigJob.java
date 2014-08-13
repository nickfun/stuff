
import java.util.concurrent.*;

public class BigJob implements Callable<String> {

    public String call() throws Exception {
        int n = ThreadLocalRandom.current().nextInt(500);
        Thread.sleep(500+n);
        System.out.print("**");
        if (n < 0) {
            n = n * -1;
        }
        return "" + n;
    }
}
