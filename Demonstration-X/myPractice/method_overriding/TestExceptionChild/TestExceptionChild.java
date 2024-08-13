/*
 * If the superclass method does not declare an exception, subclass overridden
 * method cannot declare the checked exception.
 */
// The following code gives error

// import java.io.*;

// class Parent {

// // defining the method
// void msg() {
// System.out.println("parent method");
// }
// }

// public class TestExceptionChild extends Parent {

// // overriding the method in child class
// // gives compile time error
// void msg() throws IOException {
// System.out.println("TestExceptionChild");
// }

// public static void main(String args[]) {
// Parent p = new TestExceptionChild();
// p.msg();
// }
// }