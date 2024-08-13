/*Use of yield(), stop() and sleep() methods */

class A extends Thread {
    public void run() {
        System.out.println("Start Thread A...");
        for (int i = 0; i < 5; i++) {
            if (i == 1)
                yield();
            System.out.println("From Thread A: " + i);
        }
        System.out.println("Exiting Thread A...");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Start Thread B...");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                try {
                    // stop();
                    interrupt();
                } catch (Exception e) {
                    System.out.println("Exception caught in interrupt() method: " + e);
                }
            }

            System.out.println("From Thread B: " + i);
        }
        System.out.println("Exiting Thread B...");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Start Thread C...");
        for (int i = 0; i < 5; i++) {
            if (i == 3 || i == 4) {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Exception caught in sleep() method: " + e);
                }
                System.out.println("From Thread C: " + i);
            }
        }

        System.out.println("Exiting Thread C...");
    }
}

// interrupt() only sets the interrupt flag, it doesn't actually stop the
// thread. The thread must cooperate by checking the interrupt flag and exiting
// cleanly.
// stop() is not only deprecated but also has been removed from Java 11 and
// later versions. So, it's recommended to use interrupt() instead to stop
// threads in a safe and controlled manner.

class demons_115 {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main Thread Exiting...");
    }
}