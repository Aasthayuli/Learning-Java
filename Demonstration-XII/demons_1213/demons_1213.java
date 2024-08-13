/*Handling a random access file */

import java.io.*;

/**
 * demons_1213
 */
public class demons_1213 {

    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("demons_1213.dat", "rw");// provides read-write mode both together

            // writing to the file
            file.writeChar('x');
            file.writeInt(555);
            file.writeDouble(3.1412);

            file.seek(0);// go to the beginning of the file

            // Reading from the file
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());

            file.seek(2);
            System.out.println(file.readInt());

            // Go to the end and append false to the file
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}