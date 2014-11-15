
package gs.nick.learn;

import java.util.ArrayList;


public class MyStringBuilder {
    ArrayList<String> pool;
    
    public MyStringBuilder() {
        pool = new ArrayList<String>();
    }
    
    public void add(String s) {
        pool.add(s);
    }
    
    public String buildString() {
        int length = 0;
        for (String s : pool) {
            length += s.length();
        }
        char[] newStr = new char[length];
        int index=0;
        for (String s : pool) {
            for (char c : s.toCharArray()) {
                newStr[index] = c;
                index++;
            }
        }
        return new String(newStr);
    }
}
