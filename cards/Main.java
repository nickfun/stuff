public class Main {

    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d);
        for (int i=0; i<45; i++) {
            d.deal();
        }
        System.out.println(d);
    }
}

