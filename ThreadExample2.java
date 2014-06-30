import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class ThreadExample2 extends Thread {

    private int num=0;

    public void setNum(int n) {
	num = n;
    }

    public static void main(String[] args) {
        List<ThreadExample2> threads = new ArrayList<>();
        ThreadExample2 t;
        for (int i=1; i<=10; i++) {
            t = new ThreadExample2();
            t.setNum(i);
            threads.add(t);
        }
        for (ThreadExample2 it : threads) {
            it.run();
        }
    }

    public void run() {
        try {
            myrun();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void myrun() throws InterruptedException {
	p("Hello world!");
        Random r = new Random();
        int i;
        for (int j=0; j<3; j++) {
            i = 100 + r.nextInt(300);
            p("My number is "+i);
            Thread.sleep(500);
        }
        p("END END END END");
    }

    private void p(String m) {
        System.out.println(String.format("[%03d] %s", num, m));
    }
}
