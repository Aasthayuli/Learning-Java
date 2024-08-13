
import java.io.*;

/**
 * demons_1212
 */
public class demons_1212 {

    public static void main(String[] args) throws Exception {
        // Declare files streams
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream file3 = null; // declare file3 to store combined files

        // open the files to be concatenated
        file1 = new FileInputStream("input1.txt");
        file2 = new FileInputStream("input2.txt");
        file3 = new SequenceInputStream(file1, file2);

        // create buffered input and output streams
        BufferedInputStream inBuf = new BufferedInputStream(file3);// object to read from file3
        BufferedOutputStream outBuf = new BufferedOutputStream(System.out);// object to write to console

        // Read and write til the end of buffers
        int ch;
        while ((ch = inBuf.read()) != -1) {
            outBuf.write((char) ch);
        }
        inBuf.close();
        outBuf.close();
        file1.close();
        file2.close();
        file3.close();

    }
}