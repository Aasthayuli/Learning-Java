/*Advantage of Java throws keyword
Now Checked Exception can be propagated (forwarded in call stack).
It provides information to the caller of the method about the exception. */

import java.io.IOException;

class Testthrows1 {
    void m() throws IOException {
        throw new IOException("device error");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        Testthrows1 obj = new Testthrows1();
        obj.p();
        System.out.println("normal flow...");
    }
}