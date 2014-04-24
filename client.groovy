// CLIENT
listenPort = Integer.parseInt(System.getenv("COMM_PORT"));
println "Port is " + listenPort + " ... sleep for 2 sec";
Thread.sleep(2000);

for (i=0; i<3; i++) {
    String sData = "packet #" + i;
    println "I send: " + sData;
    bData = sData.getBytes();
    byte[] inData = new byte[4096];
    InetAddress addr = InetAddress.getByName("localhost");
    DatagramSocket socket = new DatagramSocket();
    DatagramPacket packetOut = new DatagramPacket(bData, bData.length, addr, listenPort);
    socket.send(packetOut);
    DatagramPacket packetIn = new DatagramPacket(inData, inData.length);
    socket.receive(packetIn);
    String fromServer = new String(packetIn.getData());
    println "Server said: " + fromServer
    socket.close();
    Thread.sleep(1000);
}
println "Client is done!!!!!!"

