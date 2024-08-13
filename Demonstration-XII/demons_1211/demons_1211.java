/*Java SequenceInputStream Example: reading sequence of files */
//This class can handle two or more files together 

import java.io.*;

/**
 * demons_1211
 */
public class demons_1211 {

    public static void main(String[] args) throws Exception {
        FileInputStream input1 = new FileInputStream("input1.txt");
        FileInputStream input2 = new FileInputStream("input2.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        // These two sources will be scanned one by one and resultant total scanning
        // will be stored into the inst

        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char) j);// displaying the content of inst
        }
        inst.close();
        input1.close();
        input2.close();
    }
}