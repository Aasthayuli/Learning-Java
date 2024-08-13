/*Java BufferedInputStream class is used to read information from stream. 
It internally uses buffer mechanism to make the performance fast.
The important points about BufferedInputStream are:
When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
When a BufferedInputStream is created, an internal buffer array is created. */

import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("testout.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            System.out.println();
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\n");
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}