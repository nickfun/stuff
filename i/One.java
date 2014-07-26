/**
 * Nick F
 * Sat Jul 26 19:49:17 UTC 2014
 * CTCI 1.1
 */

import java.util.*;

class One {
    public static void main(String[] args) {
        //        System.out.println("hello");
        for( String w : args ) {
            if (isUniqueCharsNoMap(w) ) {
                System.out.println(w + " passed");
            } else {
                System.out.println(w + " failed");
            }
        }
        System.out.println("done");
    }

    /** Determine if a string has only unique characters */
    public static boolean isUniqueChars(String str) {
        char[] letters = str.toCharArray();
        Integer count;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : letters) {
            count = map.get(c);
            if (count == null || count == 0) {
                map.put(c,1);
            } else {
                return false;
            }
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
