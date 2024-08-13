//Java FileReader class is used to read data from the file. 
// It returns data in byte format like FileInputStream class.
// It is character-oriented class which is used for file handling in java.

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("testout.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }

        // Below code doesn't run coz file pointer has reached end of file(-1)
        // while ((i = fr.read()) != -1) {
        // System.out.print(i);
        // }
        // System.out.println("\n");

        fr.close();
    }
}

/* The below code will work for running both while loop */
// import java.io.FileReader;

// public class FileReaderExample {
// public static void main(String args[]) throws Exception {
// FileReader fr = new FileReader("testout.txt");
// int i;
// while ((i = fr.read()) != -1) {
// System.out.print((char) i);
// }

// // Close the original FileReader
// fr.close();

// // Create a new FileReader to read the file again
// fr = new FileReader("testout.txt");
// while ((i = fr.read()) != -1) {
// System.out.print(i);
// }
// System.out.println("\n");

// // Close the new FileReader
// fr.close();
// }
// }