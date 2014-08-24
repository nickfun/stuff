/**
 * Nick F
 * Sun Aug 24 04:03:18 UTC 2014
 * CTCI 1.3
 */

import java.util.Arrays;
import java.util.*;

class Three {

    public static Boolean arePermutations(String s, String t) {
        List<Character> a = new ArrayList<Character>(), b = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            a.add(c);
        }
        for (char c : t.toCharArray()) {
            b.add(c);
        }
        int i;
        for (Character c : a) {
            i = b.indexOf(c);
            if (i == -1) {
                return false;
            }
            b.remove(i);
        }
        return b.isEmpty();
    }

    public static void main(String[] args) {
        if (args.length % 2 != 0) {
            System.out.println("Error: Must provide an even number of arguments.");
        } else {
            for (int i=0; i<args.length; i += 2) {
                if (arePermutations(args[i], args[i+1])) {
                    System.out.println("Permuations: " + args[i] + " | " + args[i+1]);
                } else {
                    System.out.println("NOT Permutions: " + args[i] + " | " + args[i+1]);
                }
            }
        }
    }

}
