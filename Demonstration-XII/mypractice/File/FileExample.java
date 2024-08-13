import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        System.out.println("List of files and directories: ");
        File f = new File("C:\\Users\\HP\\JAVA NPTEL REVISION\\Demonstration-XII\\mypractice\\File");
        String filenames[] = f.list();
        for (String filename : filenames) {
            System.out.println(filename);
        }
        System.out.println();
    }
}
