public class Beer {

    public static void main(String[] args) {
        song(99);
    }

    public static void song(int i) {
        if (i <= 0) {
            return;
        }
        System.out.println(String.format("%d bottles of beer on the wall!\n%d bottles of beer!", i, i));
        System.out.println(String.format("Take one down, pass it around, \n%d bottles of beer on the wall!\n", i-1));
        song(i-1);
    }
}

