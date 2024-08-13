// Java FileWriter class is used to write character-oriented data to a file.
// It is character-oriented class which is used for file handling in java.
// Unlike FileOutputStream class, you don't need to convert string into byte
// array because it provides method to write string directly.

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("testout.txt");
            fw.write("Welcome to Java Journey.");
            fw.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}