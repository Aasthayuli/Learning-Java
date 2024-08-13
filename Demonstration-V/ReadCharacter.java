import java.io.IOException;

public class ReadCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        try {
            int input = System.in.read();
            System.out.println("You entered: " + (char) input);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

/*
  System.in.read() is a method in Java that reads a single byte of data from the standard input stream (System.in).
  It reads a byte and returns it as an int, you will get the ASCII value of the character read.
  When you run the ReadCharacter program, it prints Enter a character:.
  When you enter a character, say A, and press Enter, System.in.read() reads the ASCII value of A (which is 65).
  The program then casts this ASCII value back to a character and prints You entered: A.
 */
