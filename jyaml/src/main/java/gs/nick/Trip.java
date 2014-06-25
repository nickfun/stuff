package gs.nick;

import java.util.List;

class Trip {
    Config cfg;
    List<Packet> packets;
    
    public void setCfg( Config c ) {
        cfg = c;
    }

    public Config getCfg() {
        return cfg;
    }

    public void setPackets( List<Packet> p ) {
        packets = p;
    }

    public List<Packet> getPackets() {
        return packets;
    }

}

