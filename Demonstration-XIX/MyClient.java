import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) throws Exception{
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Server");
            dos.flush();
            dos.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
/*
 * OutputStream java.net.Socket.getOutputStream() throws IOException: Returns an
 * output stream for writing bytes to this socket.
 */
