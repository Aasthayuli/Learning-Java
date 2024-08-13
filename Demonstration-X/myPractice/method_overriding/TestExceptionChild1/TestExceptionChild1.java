/*If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception. */

// import java.io.*;

class Parent {
    void msg() {
        System.out.println("parent method");
    }
}

class TestExceptionChild1 extends Parent {
    void msg() throws ArithmeticException {
        System.out.println("child method");
        throw new ArithmeticException("Arithmetic error");
    }

    public static void main(String args[]) {
        Parent p = new TestExceptionChild1();
        System.out.println("\n");
        p.msg();
        System.out.println("hello\n"); // this line will not execute as exception is thrown after function call(msg())
    }
}