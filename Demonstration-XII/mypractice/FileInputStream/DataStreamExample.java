/*Java FileInputStream Class: Java FileInputStream class obtains input bytes from a file. 
It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. 
You can also read character-stream data. 
But, for reading streams of characters, it is recommended to use FileReader class. */

//Java FileInputStream example 1: read single character

import java.io.FileInputStream;

public class DataStreamExample {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("testout1.txt");
            int i = fin.read();
            System.out.println("Character value: " + (char) i);
            System.out.println("ASCII value: " + i);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
