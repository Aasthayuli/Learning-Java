import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("testout2.txt");
            String s = "Learning Java...";
            byte b[] = s.getBytes();// converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}