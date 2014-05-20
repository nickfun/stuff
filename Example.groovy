/**
 * Simple thing to see if Groovy threads are as easy as Java threads
 *
 * @date 2014-05-20
 */
class Example extends Thread {
  public static void main(args) {
    println("hello");
    int i=5;
    Example mythread;
    while (i>0) {
      mythread = new Example();
      mythread.start(); 
      println("---");
      i--;
    }
    println("the whole thing is done now");
  }

  public void run() {
    println("I am a thread!");
    Thread.sleep(1000);
    println("I am done :)");
  }
}

