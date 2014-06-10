import java.lang.Thread;

public class Shutdown extends Thread {
    public void run() {
        System.out.println("=== I am the shutdown! ===");
    }

    public static void main(String[] args) {
        System.out.println("Hey buddy");
        Runtime.getRuntime().addShutdownHook(new Shutdown());
        for (int i=0; i<100000; i++) {
            System.out.print(". ");
        }
    }

}
