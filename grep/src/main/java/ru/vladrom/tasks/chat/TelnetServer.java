package ru.vladrom.tasks.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TelnetServer {
    public static int TELNET_PORT = 1234;
    public static int MAX_CLIENTS_ALLOWED = 10;

    public static void main(String argc[]) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(TELNET_PORT, MAX_CLIENTS_ALLOWED);
            System.out.println("Server is listening for connections on port: " + TELNET_PORT);
            Socket connection = server.accept();
            System.out.println("Connected client from " + connection.getInetAddress().getHostAddress() + ":" + connection.getPort());
        } catch (IOException e) {
            System.out.println("Couldn't establish connection to port = " + TELNET_PORT);
            System.exit(2);
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
