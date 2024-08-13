/*Java FileInputStream: Reading a text from the file */

import java.io.FileInputStream;

/**
 * demons_125
 */
public class demons_125 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("demons_125.txt");
            int i;
            while ((i = fis.read()) != -1) {
                // until the object points at the end of the file(i.e., -1)
                // Entire file is scanned !
                System.out.print((char) i);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
