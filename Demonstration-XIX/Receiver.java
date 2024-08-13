//Server side Program
import java.net.*;

public class Receiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);
        ds.receive(dp);
        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        ds.close();
    }
}
/*
 * This Java code snippet is a simple implementation of a UDP receiver.
 * It creates a DatagramSocket on port 3000, which listens for incoming UDP
 * packets.
 * It then creates a byte array of size 1024 and a DatagramPacket to receive the
 * incoming packet.
 * The ds.receive(dp) method blocks until a packet is received.
 * Once a packet is received, it is converted to a string using new
 * String(dp.getData(), 0, dp.getLength()) and printed to the console using
 * System.out.println(str).
 * Finally, the DatagramSocket is closed using ds.close().
 * This code is useful for receiving and processing UDP packets in a Java
 * application.
 */

// int java.net.DatagramPacket.getlength(): Returns the length of the data to be
// sent or the length of the data received.
// byte[] java.net.DatagramPacket.getData(): Returns the data buffer. The data
// received or the data to be sent starts from the offset in the buffer, and
// runs for length long.
// void java.net.DatagramSocket.receive(DatagramPacket p) throws IOException