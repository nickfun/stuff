package gs.nick.learn;

public class StringDriver {
    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder();
        sb.add("Hello ");
        sb.add("world ");
        sb.add("how ");
        sb.add("are ");
        sb.add("you ");
        sb.add("doing ");
        sb.add("today?");
        
        System.out.println(sb.buildString());
        
    }
}
