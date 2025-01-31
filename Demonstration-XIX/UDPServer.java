
//Java program to illustrate Server side implementation using DatagramSocket
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        // Step1: Create a socket to listen at port 1234
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];// (Temporarily made) maximum buffer it can handle

        DatagramPacket dpReceive = null;
        while (true) {
            // Step 2: Create a Datagrampacket to receive the data
            dpReceive = new DatagramPacket(receive, receive.length);

            // step 3: Receive the data in byte buffer
            ds.receive(dpReceive);
            System.out.println("Client : " + data(receive));

            // Exit the server if the client says "bye"
            if (data(receive).toString().equals("bye")) {
                System.out.println("Client sent bye!\nEXITING.....");
                break;
            }

            // clear the buffer after every message
            receive = new byte[65535];
        }
        ds.close();
    }

    // A utility method to convert the byte array data into a string representation
    public static StringBuilder data(byte[] a) {
        if (a == null) {
            return null;
        }
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}