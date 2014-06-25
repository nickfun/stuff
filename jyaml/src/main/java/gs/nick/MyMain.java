package gs.nick;

import org.yaml.snakeyaml.constructor.SafeConstructor;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.util.TimeZone;

public class MyMain {
    public static void main( String[] args) throws FileNotFoundException {

        // ALWAYS be explicit about timezones because Timezones are terrible and want to hurt you
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

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
        Map<String, Object> packet;
        String[] keys = {
            "typeid","objectid","asn1","date","lat","lng"
        };  
        Date date;
        Integer typeid, objectid, asn1;
        Double lat, lng;
        for (Object o : packets) {
            packet = (Map<String, Object>) o;
            for (String key : keys) {
                System.out.println(key + " ==> " + packet.get(key));
            }
            System.out.println("~~~ End of packet");
            typeid = (Integer) packet.get("typeid");
            objectid = (Integer) packet.get("objectid");
            asn1 = (Integer) packet.get("asn1");
            date = (Date) packet.get("date");
            lat = (Double) packet.get("lat");
            lng = (Double) packet.get("lng");
            System.out.println(String.format("t: %d o: %d a: %d d: %s l: %f l: %f",
                                             typeid, objectid, asn1, date.toString(), lat, lng));
            System.out.println("-------------------------");
        }
    }
}

