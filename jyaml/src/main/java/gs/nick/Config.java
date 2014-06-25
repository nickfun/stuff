package gs.nick;

class Config {

	public int deviceid;
	public String backendhost;
	public int backendport;

	public void setDeviceid(int d) {
		deviceid = d;
	}

	public int getDeviceid() {
		return deviceid;
	}

	public void setBackendhost(String a) {
		backendhost = a;
	}

	public String getBackendhost() {
		return backendhost;
	}

	public void setBackendport(int p) {
		backendport = p;
	}

	public int getBackendport() {
		return backendport;
	}
}
