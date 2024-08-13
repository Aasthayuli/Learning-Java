import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2 = "";
        while (!str1.equals("stop")) {
            str1 = dis.readUTF();
            System.out.println("Client says: " + str1);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        dout.close();
        dis.close();
        s.close();
        ss.close();
    }
}