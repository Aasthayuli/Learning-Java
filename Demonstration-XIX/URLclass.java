
// import java.io.*;
import java.net.*;

public class URLclass {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.youtube.com/");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }
}