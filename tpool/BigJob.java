
import java.util.concurrent.*;

public class BigJob implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(1000);
        System.out.println("*");
        return "$$$";
    }
}
