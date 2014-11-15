package gs.nick.learn;

import java.util.Arrays;

public class Four {

    public static void main(String[] args) {
        Four f = new Four();
        f.run();
    }

    public void run() {
        char[] test = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', ' '};
        char[] test2 = {'h', 'e', 'y', ' ', 'b', 'u', 'd', 'd', 'y', ' ', 'w', 'h', 'a', 't', '\'', 's', ' ', 'g', 'o', 'i', 'n', 'g', ' ', 'o', 'n', '?', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        System.out.print(test); System.out.println("|");
        System.out.println(encode(test, test.length - 2));
        System.out.print(test2);System.out.println("|");
        System.out.println(encode(test2, test2.length - 8));
    }

    public String encode(char[] str, int length) {
        int numSpaces = 0;
        int realLength;
        for (int i = 0; i < length; i++) {
            if (str[i] == ' ') {
                numSpaces++;
            }
        }
        realLength = length + numSpaces * 2;
        int j = length - 1;
        for (int i = realLength - 1; i > 0; i--) {
            if (str[j] == ' ') {
                // do the encode on space
                str[i] = '0';
                str[i - 1] = '2';
                str[i - 2] = '%';
                i = i - 2;
            } else {
                // simple copy
                str[i] = str[j];
            }
            j--;
        }
        return new String(str);
    }
}
