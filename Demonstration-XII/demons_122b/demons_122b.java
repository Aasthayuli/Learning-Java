/*Java FileOutputStream : Writing a byte into a file*/

import java.io.*;

/**
 * demons_122b
 */
public class demons_122b {

    public static void main(String[] args) {
        byte cities[] = { 'D', 'E', 'L', 'H', 'I', ' ', 'M', 'A', 'D', 'R', 'A', 'S', ' ', 'L', 'O', 'N', 'D', 'O', 'N',
                '\n' };
        FileOutputStream outFile = null;
        try {
            outFile = new FileOutputStream("cities.txt");
            outFile.write(cities);
            outFile.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}