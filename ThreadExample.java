public class ThreadExample extends Thread {

    private int num=0;

    public void setNum(int n) {
	num = n;
    }

    public static void main(String[] args) {
	System.out.println("Begin");
	ThreadExample t;
	for (int i=0; i<10; i++) {
	    t = new ThreadExample();
	    t.setNum(i);
	    t.run();
	    t.fun();
	}
	System.out.println("End");
    }

    public void run() {
	System.out.println("Hello world!");
    }

    public void fun() {
	System.out.println(num + " threads are fun!");
    }
}
