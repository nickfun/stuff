import javax.xml.bind.DatatypeConverter;

public class HexChar {

    public static void main(String[] args) {
	HexChar hc = new HexChar();
	String input = "0001020F0A0A";
	System.out.println("Input: " + input);
	byte[] data = new byte[6];
	data[0] = 0;
	data[1] = 1;
	data[2] = 2;
	data[3] = 15; // F
	data[4] = 10; // A
	data[5] = 10; // A
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
	System.out.println("len: " + data.length);
    }

    public byte[] convert(String input) {
	return DatatypeConverter.parseHexBinary(input);
    }
}
