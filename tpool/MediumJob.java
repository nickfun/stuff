
import java.util.concurrent.*;

public class MediumJob implements Callable<String> {

    public String call() throws Exception {
        int n = ThreadLocalRandom.current().nextInt(500);
        Thread.sleep(500+n);
        System.out.print("mm");
        return "" + (500+n);
    }
}
