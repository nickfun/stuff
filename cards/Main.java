public class Main {

    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println("BEGIN:");
        System.out.println(d);
        for (int i=0; i<45; i++) {
            d.deal();
        }
        System.out.println("AFTER 45 CARDS:");
        System.out.println(d);
    }
}

