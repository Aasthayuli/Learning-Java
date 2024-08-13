import java.net.*;
import java.io.*;

class MyClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 3333);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2 = "";
        while (!str1.equals("stop")) {
            str1 = br.readLine();
            dout.writeUTF(str1);
            dout.flush();
            str2 = dis.readUTF();
            System.out.println("Server says: " + str2);
        }
        dout.close();
        dis.close();
        s.close();
    }
}

