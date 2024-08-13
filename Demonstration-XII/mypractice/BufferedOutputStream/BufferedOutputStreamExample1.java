/*Java BufferedOutputStream class is used for buffering an output stream. 
It internally uses buffer to store data. 
It adds more efficiency than to write data directly into a stream. 
So, it makes the performance fast. */
/*In this example, we are writing the textual information in the BufferedOutputStream object which is connected to the FileOutputStream object. 
The flush() flushes the data of one stream and send it into another. 
It is required if you have connected the one stream with another. */
//here, \r is used as a line separator

import java.io.*;

public class BufferedOutputStreamExample1 {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("testout1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Buffer in BufferedOutputStream\r\n" + //
                "\r\n" + //
                "In the context of BufferedOutputStream, a buffer is a region of memory that is used to store data temporarily before it is written to the underlying output stream. The buffer is an array of bytes that acts as a intermediate storage area between the program and the output stream.\r\n"
                + //
                "\r\n" + //
                "Here's how it works:\r\n" + //
                "\r\n" + //
                "When you write data to a BufferedOutputStream, the data is first stored in the buffer.\r\n" + //
                "The buffer is filled with data until it reaches its capacity or until the flush() method is called.\r\n"
                + //
                "When the buffer is full or the flush() method is called, the data is written from the buffer to the underlying output stream in a single operation.\r\n"
                + //
                "The buffer is then cleared, and the process starts again..";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}