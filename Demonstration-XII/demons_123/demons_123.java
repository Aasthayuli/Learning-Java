/*Java FileOutputStream: Writing  a String to a file */

import java.io.*;

/**
 * demons_123
 */
public class demons_123 {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("abc.txt");
            String s = "Welcome to java";
            byte b[] = s.getBytes(); // converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("File Writing successful...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}