package protocols.TCP;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server.");

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String userInput;
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("Received from server: " + in.readLine());
        }

        socket.close();
        System.out.println("Connection closed.");
    }
}

