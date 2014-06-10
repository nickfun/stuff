import java.lang.Thread;

public class Shutdown extends Thread {
    public void run() {
        System.out.println("\n=== I am the shutdown! ===");
    }

    public static void main(String[] args) {
        System.out.println("Hey buddy");
        Runtime.getRuntime().addShutdownHook(new Shutdown());
        try {
            for (int i=0; i<100000; i++) {
                System.out.print(". ");
                Thread.sleep(1000);
            }
        }
        catch ( InterruptedException e) {
            System.out.println("The sleep was interrupted :(");
            return;
        }
    }

}
