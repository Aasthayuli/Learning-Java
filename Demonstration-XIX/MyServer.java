
//Explains TCP-IP protocol
import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket ss = new ServerSocket(6666);// ServerSocket class is for server side programming
            Socket s = ss.accept();// establishes connection.
            // ss.accept() is basically the request that can be attended by the server and
            // accepted.
            // So, Socket object is created regarding to this one.Hence, it is ready.
            // Socket class is for client side programming
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("Message: " + str);
            ss.close();// ServerSocket closed!
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
/*
 * InputStream java.net.Socket.getInputStream() throws IOException: Returns an
 * input stream for this socket.
 */