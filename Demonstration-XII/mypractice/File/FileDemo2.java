import java.io.*;

public class FileDemo2 {
    public static void main(String[] args) {

        String path = "";
        boolean bool = false;
        try {
            System.out.println();
            // createing new files
            File file = new File("testFile1.txt");
            file.createNewFile();
            System.out.println(file);// prints name of the file

            // createing new canonical from file object
            File file2 = file.getCanonicalFile();
            // returns true if the file exists
            System.out.println(file2);// prints path of the file

            bool = file2.exists();
            System.out.println(bool);// prints true if the file exists

            // returns absolute pathname
            path = file2.getAbsolutePath();
            // if file exists
            if (bool) {
                // prints
                System.out.print(path + " Exists? " + bool);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
        System.out.println("\n");
    }
}