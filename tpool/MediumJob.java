
import java.util.concurrent.*;

public class MediumJob implements Callable<String> {

    public String call() throws Exception {
        int n = ThreadLocalRandom.current().nextInt(500);
        n = 100;
        Thread.sleep(500+n);
        System.out.print("--");
        return "" + (500+n);
    }
}