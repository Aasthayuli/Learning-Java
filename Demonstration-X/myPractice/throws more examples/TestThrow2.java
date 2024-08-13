//Example 2: Throwing Checked Exception
/*If we throw a checked exception using throw keyword, it is must to handle the exception using catch block or the method must declare it using throws declaration. */

import java.io.*;

public class TestThrow2 {

    // function to check if person is eligible to vote or not
    public static void method() throws FileNotFoundException, Exception {

        FileReader file = new FileReader("abc.txt");
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println("\nAlthough file is present , but we have explicitly thrown the exception");
        throw new FileNotFoundException();
    }

    // main method
    public static void main(String args[]) {
        try {
            method();
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception !");
        } catch (Exception e) {
            System.out.println("Another Exception occurred !");
        }
        System.out.println("rest of the code...\n");
    }
}