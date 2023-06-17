package protocols.UDP;

import java.net.*;
import java.io.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput = stdIn.readLine();
        byte[] buffer = userInput.getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5555);
        socket.send(packet);
        buffer = new byte[1024];
        packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        System.out.println("Server: " + new String(packet.getData(), 0, packet.getLength()));
    }
}

