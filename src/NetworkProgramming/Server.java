package NetworkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Server is Starting.....");
        // Initiation of a Server Socket
        ServerSocket serverSocket = new ServerSocket(9000);
        System.out.println("Server Started");

        Socket client = serverSocket.accept(); // Listening for a Client Connection
        System.out.println("Client Connected");

        DataInputStream dataInputStream = new DataInputStream(client.getInputStream()); // TODO: 3/14/2023 Reading the Message
        DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());// TODO: 3/14/2023 Sending the Message

        Scanner scanner = new Scanner(System.in);

        String clientMessage=null;
        while (!dataInputStream.equals("Bye")){
            clientMessage = dataInputStream.readUTF();
            System.out.println(clientMessage);

            System.out.println("Your Reply : ");
            dataOutputStream.writeUTF(scanner.nextLine());
            dataOutputStream.flush();
        }
    }
}
