
//Client side program
import java.net.*;

public class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String str = "Hello to Java Network Programming";
        InetAddress ip = InetAddress.getByName("127.0.0.1");// local machine ip address
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        ds.send(dp);
        ds.close();
    }
}