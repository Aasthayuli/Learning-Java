
/*Java FileOutputStream is an output stream used for writing data to a file.
If you have to write primitive values into a file, use FileOutputStream class. 
You can write byte-oriented as well as character-oriented data through FileOutputStream class. 
But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.

*/

//Java FileOutputStream Example 1: write byte
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("testout1.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}