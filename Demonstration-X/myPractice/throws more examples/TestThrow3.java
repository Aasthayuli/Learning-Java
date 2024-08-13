//Example 3: Throwing User-defined Exception
/* This program shows that we can throw user-defined exception using the throw keyword. */

// class represents user-defined exception  
class UserDefinedException extends Exception {
    public UserDefinedException(String str) {
        // Calling constructor of parent Exception
        super(str);
    }
}

// Class that uses above MyException
public class TestThrow3 {
    public static void main(String args[]) {
        try {
            // throw an object of user defined exception
            throw new UserDefinedException("This is user-defined exception");
        } catch (UserDefinedException ude) {
            System.out.println("\nCaught the exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage() + "\n");
        }
    }
}