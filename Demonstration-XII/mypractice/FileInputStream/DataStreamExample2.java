
//Java FileInputStream example 2: read all characters

import java.io.FileInputStream;

public class DataStreamExample2 {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("testout1.txt");
            int i = 0;
            System.out.println("Contents of the file: ");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}