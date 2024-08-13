
//Java program to illustrate client side implementation using DatagramSocket
import java.util.Scanner;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // step 1: create a socket object for carrying the data
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte[] buf = null;

        // while loop for until user not enters "bye"
        while (true) {
            String inp = sc.nextLine();

            // convert the String input into the byte array
            buf = inp.getBytes();

            // step 2: Create the datagramPacket for sending the data
            DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, 1234);

            // step 3: invoke the send call to actually send the data
            ds.send(dp);

            // break the loop if user enters "bye"
            if (inp.equals("bye")) {
                break;
            }
        }
        ds.close();
        sc.close();
    }
}