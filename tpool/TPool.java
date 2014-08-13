import java.util.concurrent.*;

public class TPool {
    public static void main(String[] args) throws Exception {
        TPool me = new TPool();
        me.execute();
        System.out.println("Done");
    }

    public TPool() {
        System.out.println("New TPool!");
    }

    public void execute() throws Exception {
        // pool of workers
        ExecutorService pool = Executors.newFixedThreadPool(1);
       
        // submit job
        Future<String> future = pool.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("begin sleep");
                    Thread.sleep(1500);
                    System.out.println("End sleep");
                    return "Hello from child callable!";
                }
            });
        
        // get value
        System.out.println("Block on future");
        String msg = future.get();
        System.out.println("Message is: " + msg);
        pool.shutdown();
    }
}

