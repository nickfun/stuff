import javax.xml.bind.DatatypeConverter;

public class HexChar {

    public static void main(String[] args) {
	HexChar hc = new HexChar();
	String input = "012FAA";
	System.out.println("Input: " + input);
	byte[] data = new byte[6];
	data[0] = 0;
	data[1] = 1;
	data[2] = 2;
	data[3] = 15;
	data[4] = 10;
	data[5] = 10;
	byte[] result = hc.convert(input);
	System.out.println("string input: " + input);
	hc.printB("data", data);
	hc.printB("result", result);
	return;
    }

    public void printB(String pre, byte[] data) {
	System.out.print(pre + ": ");
	for (byte b : data) {
	    System.out.print(" " + b);
	}
	System.out.println("");
    }

    public byte[] convert(String input) {
	return DatatypeConverter.parseHexBinary(input);
	/*
	byte[] result = new byte[ input.length() ];
	char c;
	for (int i=0; i<input.length(); i++) {
	    c = input.charAt(i);
	    int z = (int) c;
	    if (z >= 70) {
		z -= 55;
		result[i] = (byte)z;
	    } else {
		z -= 48;
		result[i] = (byte)z;
	    }
	}
	return result;
	*/
    }
}
