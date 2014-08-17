/**
 * Lines
 */

import java.util.Random;

class Lines {

    private String tpl = "*";

    public static void main (String[] args) throws InterruptedException {
        Lines l = new Lines();
        while (true) {
            l.run(40);
        }
    }

    public void run(int size) throws InterruptedException {
        Random rng = new Random(System.currentTimeMillis());
        int sleep;

        for (int i=0; i<size; i++) {
            sleep = 100 + rng.nextInt(2000);
            Thread.sleep(sleep);
            System.out.println(buildString(tpl, 2*i));
        }
        for (int i=size; i>0; i--) {
            sleep = 100 + rng.nextInt(2000);
            Thread.sleep(sleep);
            System.out.println(buildString(tpl, 2*i));
        }
    }

    public String buildString(String tpl, int size) {
        String out = "";
        for (int i=0; i<size; i++) {
            out = out + tpl;
        }
        return out;
    }

}
