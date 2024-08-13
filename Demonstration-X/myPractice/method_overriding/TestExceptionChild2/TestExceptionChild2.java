/*
 * If the superclass method declares an exception, subclass overridden method
 * can declare the same subclass exception or no exception but cannot declare
 * parent exception.
 */

// The below code thows error.

// import java.io.*;
// class Parent{
// void msg()throws ArithmeticException {
// System.out.println("parent method");
// }
// }

// public class TestExceptionChild2 extends Parent{
// void msg()throws Exception {
// System.out.println("child method");
// }

// public static void main(String args[]) {
// Parent p = new TestExceptionChild2();

// try {
// p.msg();
// }
// catch (Exception e){}

// }
// }