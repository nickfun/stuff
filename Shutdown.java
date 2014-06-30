class Shutdown {
    private class Ender extends Thread {
	public void run() {
	    System.out.println("==== END PROGRAM ====");
	}
    }

    public static void main(String args) {
	System.out.println("Hello!");
	Runtime.getThread().registerShutdownHook(new Ender());
	
    }

}
