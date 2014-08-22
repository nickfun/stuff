/**
 * Nick F
 * Sat Jul 26 19:49:17 UTC 2014
 * CTCI 1.1
 */

import java.util.*;

class One {
    public static void main(String[] args) {
        for( String w : args ) {
            if (isUniqueCharsNoMap(w) ) {
                System.out.println(w + " | All Unique");
            } else {
                System.out.println(w + " | Not All Unique");
            }
        }
        System.out.println("done");
    }

    /** Determine if a string has only unique characters */
    public static boolean isUniqueChars(String str) {
        char[] letters = str.toCharArray();
        Integer count;
        HashSet<Character> set = new HashSet<>();
        for (char c : letters) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

    /** Determie if a string has only unique chars, do not use extra data structure */
    public static boolean isUniqueCharsNoMap(String str) {
        char[] letters = str.toCharArray();
        char test;
        for (int i=0; i<letters.length; i++) {
            test = letters[i];
            for (int j=i+1; j<letters.length; j++) {
                if (test == letters[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
