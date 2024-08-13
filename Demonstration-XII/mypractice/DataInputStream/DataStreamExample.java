// Java DataInputStream class allows an application to read primitive data from
// the input stream in a machine-independent way.
// Java application generally uses the data output stream to write data that can
// later be read by a data input stream.

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(
                "C:\\Users\\HP\\JAVA NPTEL REVISION\\Demonstration-XII\\mypractice\\DataOutputStream\\testout.txt");

        // InputStream input = new FileInputStream("testout.txt");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        // int available(): It is used to return the estimated number of bytes that can
        // be read from the input stream.
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k + "-");
        }
        inst.close();
        input.close();
    }
}