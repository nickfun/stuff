import java.lang.Thread;

public class Shutdown {
    public static void main(String[] args) {

        System.out.println("Begin");

        Runtime.getRuntime().addShutdownHook( new Thread() {
            public void run() {
                System.out.println("\n==== SHUTDOWN");
            }
        });

        try {
            for (int i=0; i<100000; i++) {
                System.out.print(". ");
                Thread.sleep(1000);
            }
        } catch ( InterruptedException e) {
            System.out.println("The sleep was interrupted :(");
            return;
        }
    }

}
