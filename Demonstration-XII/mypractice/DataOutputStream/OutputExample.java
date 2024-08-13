/*Java DataOutputStream class allows an application to write primitive Java data types to the output stream in a machine-independent way.
Java application generally uses the data output stream to write data that can later be read by a data input stream. */

import java.io.*;

public class OutputExample {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("testout.txt");
            DataOutputStream data = new DataOutputStream(file);
            data.writeInt(65);
            data.flush();
            data.close();
            System.out.println("Succcess...");
        } catch (IOException e) {
            System.err.println("IO Exception occured");
        }

    }
}
