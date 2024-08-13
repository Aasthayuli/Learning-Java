/*If the superclass method declares an exception, subclass overridden method can declare the same subclass exception or no exception but cannot declare parent exception. */

//Example in case subclass overridden method declares subclass exception

// import java.io.*;

class Parent {
    void msg() throws Exception {
        System.out.println("parent method");
    }
}

public class TestExceptionChild4 extends Parent {
    void msg() throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        Parent p = new TestExceptionChild4();

        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}