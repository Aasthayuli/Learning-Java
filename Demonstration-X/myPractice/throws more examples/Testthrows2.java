/*Case 1: Handle Exception Using try-catch block */

import java.io.*;

class M {
    void method() throws ArithmeticException {
        throw new ArithmeticException("device error");
    }
}

public class Testthrows2 {
    public static void main(String args[]) {
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }
}

/*
 * If you handle the exception within the method() itself, you wouldn't need to
 * declare it in the method signature or catch it in the main() method.
 */

// class M {
// void method() {
// try {
// throw new IOException("device error");
// } catch (IOException e) {
// System.out.println("Exception handled in method()");
// }
// }
// }

// public class Testthrows2 {
// public static void main(String args[]) {
// M m = new M();
// m.method();
// System.out.println("normal flow...");
// }
// }