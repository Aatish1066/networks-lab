package protocols.UDP;

import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(5555);
        System.out.println("Server started, waiting for client...");
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        System.out.println("Client connected: " + packet.getAddress());
        String inputLine = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Client: " + inputLine);
        String outputLine = "Server: " + inputLine;
        buffer = outputLine.getBytes();
        packet = new DatagramPacket(buffer, buffer.length, packet.getAddress(), packet.getPort());
        socket.send(packet);
    }
}

