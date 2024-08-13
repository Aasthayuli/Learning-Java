/*Example of BufferedOutputStream class for writing into a file */

import java.io.*;

/**
 * demons_129
 */
public class demons_129 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("demons_129.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Hello World";
        // s can form a network channel.
        // It requires internet connection.
        // So, it is not possible here but You will receive the BufferedOutputStream
        // from the network wherever the stream will come, we will buffer it first in
        // our local buffer , and from that buffer we will push into the target file.
        // like getting an image from network and saving it in a local file then we have
        // to buffer it first.
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Successfully written !");
    }
}