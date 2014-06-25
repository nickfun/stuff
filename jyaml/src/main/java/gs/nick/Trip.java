package gs.nick;

import java.util.List;

class Trip {
    Config config;
    List<Packet> packets;
    
    public void setConfig( Config c ) {
        config = c;
    }

    public Config getConfig() {
        return config;
    }

    public void setPackets( List<Packet> p ) {
        packets = p;
    }

    public List<Packet> getPackets() {
        return packets;
    }

}

