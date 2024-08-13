/*Setting priority to threads */

class A extends Thread {
    public void run() {
        System.out.println("Thread A started...");
        for (int i = 0; i < 5; i++) {
            System.out.println("From thread A: " + i);
        }
        System.out.println("Exiting Thread A ...");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B started...");
        for (int i = 0; i < 5; i++) {
            System.out.println("From thread B: " + i);
        }
        System.out.println("Exiting Thread B ...");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Thread C started...");
        for (int i = 0; i < 5; i++) {
            System.out.println("From thread C: " + i);
        }
        System.out.println("Exiting Thread C ...");
    }
}

/**
 * demons_117
 */
public class demons_117 {

    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();

        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(t2.getPriority() + 1);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread exiting...");
    }
}