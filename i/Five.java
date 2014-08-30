/**
 * Nick Fun
 * 2014-08-29
 * CTCI 1.5
 * basic string comparison with counts of repeate characters. input: aaaaabbbc output: a5b3c1
 */

class Five {
    
    public static void main(String[] args) {
	for (String s : args) {
	    System.out.println(s + " | " + compress2(s));
	}
    }

    public static String compress2(String str) {
	String com = "";
	if (str.length() == 0) {
	    return str;
	}
	char[] chars = str.toCharArray();
	int counter = 1;
	for (int i=0; i<str.length()-1; i++) {
	    if (chars[i] == chars[i+1]) {
		counter++;
	    } else {
		com = com + Character.toString(chars[i]);
		if (counter > 1) {
		    com = com + Integer.toString(counter);
		}
		counter = 1;
	    }
	}
	com = com + Character.toString(chars[str.length()-1]);
	if (counter > 1) {
	    com = com + Integer.toString(counter);
	}

	return com;
    }

    public static String compress1(String str) {
	String com = "";
	char[] stringAsChars = str.toCharArray();
	Character last = stringAsChars[0];
	int counter = 0;
	for (Character c : stringAsChars) {
	    if (c == last) {
		counter++;
		System.out.println(c + " === " + last + "   " + counter);
	    } else {
		if (counter == 0) {
		    com = com + Character.toString(c);
		} else {
		    com = com + Character.toString(c) + Integer.toString(counter);
		}
		counter = 0;
		System.out.println(c + " !== " + last + "   " + counter);
	    }
	    last = c;
	}
	if (com.length() < str.length()) {
	    return com;
	}
	return str;
    }
}

