// SERVER

addShutdownHook {
    println "=========[ shutdown hook ]=====";
}


listenport = Integer.parseInt(System.getenv("COMM_PORT"));
InetAddress listenaddr = InetAddress.getByName("localhost");
byte[] rawdatain = new byte[4096];
byte[] rawdataout = new byte[4096];
println "server is listening on port " + listenport;

while (true) {
    DatagramSocket socket = new DatagramSocket(listenport, listenaddr);
    DatagramPacket packetin = new DatagramPacket(rawdatain, rawdatain.length);
    socket.receive(packetin);
    String datain = new String(packetin.getData());
    System.out.println("in: " + datain);
    InetAddress addr = packetin.getAddress();
    int port = packetin.getPort();
    rawdataout = ("ACK for " + datain).getBytes();
    DatagramPacket packetout = new DatagramPacket(rawdataout, rawdataout.length, addr, port);
    socket.send(packetout);
    socket.disconnect();
    socket.close();
    println("socket was closed");
    socket = null;
}

