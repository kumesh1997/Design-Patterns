package NetworkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 9000);

        //send a message to the Server
        // TODO: 3/13/2023 Use Output Stream
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        //Receive message from the Server
        // TODO: 3/13/2023 Use Input Stream
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        Scanner scanner = new Scanner(System.in);
        String message = "";
        while (!message.equals("Bye")){
            System.out.println("Enter Your Message :");
            message = scanner.nextLine();
            dataOutputStream.writeUTF(message);
            dataOutputStream.flush();

            System.out.println("Server Says :" + dataInputStream.readUTF());
        }

        dataOutputStream.close();
        socket.close();


    }
}
