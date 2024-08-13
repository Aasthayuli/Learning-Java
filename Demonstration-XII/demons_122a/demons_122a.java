/*Java FileOutputStream : Write a byte into a file */

import java.io.FileOutputStream;

/**
 * demons_122a
 */
public class demons_122a {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream(
                    "C:\\Users\\HP\\JAVA NPTEL REVISION\\Demonstration-XII\\demons_122a\\test.txt");
            fout.write(68); // writes D
            fout.write(65);
            fout.write(65);
            fout.write(65);
            fout.close();
            System.out.println("File writing is over!");
        } catch (Exception e) {

        }
    }
}