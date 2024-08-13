/*Java ByteArrayOutputStream class is used to write common data into multiple files. 
In this stream, the data is written into a byte array which can be written to multiple streams later.
The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
The buffer of ByteArrayOutputStream automatically grows according to data. */

import java.io.*;

public class DataStreamExample {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout1 = new FileOutputStream("f1.txt");
        FileOutputStream fout2 = new FileOutputStream("f2.txt");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();// has no effect
        System.out.println("Success...");
    }
}

/*
 * In the given code, bout.flush() has no effect because the
 * ByteArrayOutputStream class does not buffer its output in the same way that
 * other output streams do.
 * ByteArrayOutputStream is a stream that writes data to a byte array, rather
 * than to a file or network connection.
 * When you write data to a ByteArrayOutputStream, it is immediately stored in
 * the underlying byte array.
 * The flush() method is typically used to force any buffered output bytes to be
 * written to the underlying output stream.
 * However, since ByteArrayOutputStream does not buffer its output, calling
 * flush() has no effect.
 * Why bout.flush() is still used?: Although bout.flush() has no effect in this
 * specific case, it is still a good practice to call flush() before closing the
 * stream.
 */