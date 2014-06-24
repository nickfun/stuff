package gs.nick;

import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.Map;
import java.util.List;

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
	Map<String, Object> data = (Map<String, Object>)  y.load(is);
	Map<String, Object> config = (Map<String, Object>) data.get("config");
        List<Object> packets = (List<Object>) data.get("packets");
        System.out.println("config is");
        System.out.println(config);
        System.out.println("Packets is");
        System.out.println(packets);
    }
}

