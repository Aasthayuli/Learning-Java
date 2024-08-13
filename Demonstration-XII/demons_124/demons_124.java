/*Java FileInputStream: Reading a single character from a file  */

import java.io.FileInputStream;

public class demons_124 {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("abc.txt");// this object points to the 1st character of the file
            int i = fin.read();// Hence, reads the first character from the file in it's ASCII format
            System.out.println("First character from the file is: " + (char) i);
            System.out.println("ASCII value: " + i);
            fin.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}