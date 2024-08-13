/*Case 2: Declare Exception */

//A) If exception does not occur
//In case we declare the exception, if exception does not occur, the code will be executed fine.

import java.io.*;

class M {
    void method() throws IOException {
        System.out.println("device operation performed");
    }
}

class Testthrows3 {
    public static void main(String args[]) throws IOException {// declare exception
        M m = new M();
        m.method();

        System.out.println("normal flow...");
    }
}

// B) If exception occurs
// In case we declare the exception and the exception occurs, it will be thrown
// at runtime because throws does not handle the exception.
// import java.io.*;

// class M {
// void method() throws IOException {
// throw new IOException("device error");
// }
// }

// class Testthrows3 {
// public static void main(String args[]) throws IOException {// declare
// exception
// M m = new M();
// m.method();

// System.out.println("normal flow...");
// }
// }