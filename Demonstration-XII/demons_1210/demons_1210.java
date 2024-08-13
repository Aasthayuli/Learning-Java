/*Example of Java BufferedInputStream for reading from a file */

import java.io.*;

public class demons_1210 {

    public static void main(String[] args) {
        try {
            // here we can mention network port number, socket, etc., instead of
            // demons_1210.txt
            FileInputStream fis = new FileInputStream("demons_1210.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            bis.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}