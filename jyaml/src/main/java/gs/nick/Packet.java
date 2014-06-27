package gs.nick;

import java.util.Date;

public class Packet {

    public int typeid;
    public int objectid;
    public int asn1;
    public Date date;
    public float lat;
    public float lng;
    public String comment;
    
    public String toString() {
        String str;
        if (date == null) {
            str = "-null-";
        } else {
            str = date.toString();
        }
        if (comment == null) {
            comment = "-null-";
        }
        return String.format("typeid: %d\nobject: %d\nasn1: %d\ndate: %s\nlat: %f\nlng: %f\ncomment: %s\n",
                             typeid, objectid, asn1, str, lat, lng, comment);
    }
    
}
