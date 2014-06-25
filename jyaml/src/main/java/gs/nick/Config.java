package gs.nick;

class Config {
    public int ccid;
    public String atphost;
    public int atpport;

    public void setCcid(int c) {
        ccid = c;
    }

    public int getCcid() {
        return ccid;
    }

    public void setAtphost(String a) {
        atphost = a;
    }

    public String getAtphost() {
        return atphost;
    }

    public void setAtpport(int p){
        atpport = p;
    }

    public int getAtpport() {
        return atpport;
    }
}
