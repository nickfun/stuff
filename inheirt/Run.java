public class Run {

    public static void main(String[] args) {
        MyParent par = new MyParent();
        MyChild chi = new MyChild();

        par.setName("dude");
        chi.setName("other dude");

        System.out.println(par.getName());
        System.out.println(chi.getName());

    }
}
