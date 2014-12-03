public class JBin {

    public static void main(String[] args) {
        byte b = (byte) (0xFF);
        int mask = 0xFF;
        int result = b & mask;
        System.out.println("b is " + b);
        System.out.println("mask is " + mask);
        System.out.println("apply: " + result);
    }
}
