import java.net.*;

public class InetAddressClass {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println(ip);
            System.out.println("Host name: " + ip.getHostName());
            System.out.println("Host address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}