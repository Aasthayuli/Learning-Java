// SequenceInputStream class is used to read data from multiple streams. 
// It reads data sequentially (one by one).

import java.io.*;

class InputStreamExample {
    public static void main(String args[]) throws Exception {
        FileInputStream input1 = new FileInputStream("testin.txt");
        FileInputStream input2 = new FileInputStream("testout.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char) j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}