/**
 * Nick F
 * Sat Jul 26 19:55:22 UTC 2014
 * CTCI 1.2
 */


class Two {
    public static void main(String[] args) {
        System.out.println("hi");
        String r;
        for (String s : args) {
            r = new String(reverse(s));
            System.out.println(s + " | " + r);
        }
        System.out.println("done");
    }

    public static char[] reverse(String str) {
        char[] r = str.toCharArray();
        char t;
        int mid = r.length/2;
        int end = r.length-1;
        for (int i=0; i<mid; i++) {
            t = r[end-i];
            r[end-i] = r[i];
            r[i] = t;
        }
        return r;
    }
}
