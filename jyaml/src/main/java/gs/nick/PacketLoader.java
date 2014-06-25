package gs.nick;

import java.util.*;
import java.io.*;
/*
 import org.yaml.snakeyaml.TypeDescription;
 import org.yaml.snakeyaml.Util;
 import org.yaml.snakeyaml.nodes.Tag;
 import org.yaml.snakeyaml.representer.Representer;
 import org.yaml.snakeyaml.constructor.*;
 */
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;

class PacketLoader {

	private final String inputFile = "input.yaml";

	public void loadFile() throws FileNotFoundException {
		System.out.println("I should load file " + inputFile);

		Constructor cons = new Constructor(Trip.class);
		TypeDescription packetDesc = new TypeDescription(Packet.class);
		TypeDescription configDesc = new TypeDescription(Config.class);
		TypeDescription tripDesc = new TypeDescription(Trip.class);

		System.out.println("Did that work?");

		tripDesc.putListPropertyType("packets", Packet.class);
		cons.addTypeDescription(configDesc);
		cons.addTypeDescription(tripDesc);
		cons.addTypeDescription(packetDesc);

		System.out.println("???");

		InputStream is = new FileInputStream(new File(inputFile));
		Yaml yaml = new Yaml(cons);
		Trip trip = (Trip) yaml.load(is);

		System.out.println("I have this many packets: " + trip.getPackets().size());
	}

}
