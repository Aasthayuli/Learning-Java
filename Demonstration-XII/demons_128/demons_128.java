/*Copying a file into another file using ByteStream class */
//ByteStream class: Reads as a byte

import java.io.*;

public class demons_128 {

    public static void main(String[] args) {
        // Declare input and output streams
        FileInputStream infile = null;// Input stream
        FileOutputStream outfile = null;// Output stream

        byte byteRead;// declare a variable to hold a byte
        try {
            // connect infile to input.txt
            infile = new FileInputStream("input.txt");

            // connect outfile to output.txt
            outfile = new FileOutputStream("output.txt");

            // Reading bytes from infile and writing them to outfile
            byteRead = (byte) infile.read();// causes IOException
            while (byteRead != -1) {
                outfile.write(byteRead);// causes IOException
                byteRead = (byte) infile.read();// causes IOException
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
        } finally {
            try {
                infile.close();
                outfile.close();
            } catch (Exception e) {
                System.out.println("Error in closing files.");
            }
            System.out.println("Done.");
        }
    }
}
