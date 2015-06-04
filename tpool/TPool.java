/** 
 * Learning to use Executors and Pools of Callable jobs
 *
 */

import java.util.concurrent.*;
import java.util.*;

public class TPool {
    public static void main(String[] args) throws Exception {
        TPool me = new TPool();
        me.execute();
        System.out.println("Done");
    }

    public TPool() {
        System.out.println("New TPool!");
    }

    /** Example from SO answer */
    public void executeOne() throws Exception {
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

    public void execute() throws Exception {
        int NUM_JOBS = 20; // this many of each TYPE of job will be created
        int NUM_THREADS = NUM_JOBS / 4;
        ExecutorService pool = Executors.newFixedThreadPool(NUM_THREADS);
        List<Callable<String>> jobs = new ArrayList<>();
        List<Future<String>> answers;
        for (int i=0; i<NUM_JOBS; i++) {
            jobs.add( new BigJob() );
            jobs.add( new MediumJob() );
        }
        System.out.println("wait");
        System.out.println(String.format("Jobs: %d  Threads: %d", jobs.size(), NUM_THREADS));
        Thread.sleep(1000);
        System.out.println("GO!");
        answers = pool.invokeAll(jobs);
        System.out.println("\ninvokeAll has been called");
        for (Future<String> f : answers) {
            System.out.print(f.get() + " ");
        }
        pool.shutdown();
    }
}

