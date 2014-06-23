package gs.nick;

import org.yaml.snakeyaml.Yaml;
import java.io.*;

public class MyMain {
    public static void main( String[] args) throws FileNotFoundException {
	System.out.println("Hello");
	System.out.println("World");

	test();
    }

    public static void test() throws FileNotFoundException {
	System.out.println("I am test");
	InputStream is = new FileInputStream(new File("input.yaml"));
	Yaml y = new Yaml();
	Object data = y.load(is);
	System.out.println(data);
    }
}

