/*creating three threads using the Runnable interface and then running them concurrently. */

class threadA implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("From thread A with i= " + (-1 * i));
        }
        System.out.println("Exiting from Thread A...");
    }
}

class threadB implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("From thread B with i= " + (2 * i));
        }
        System.out.println("Exiting from Thread B...");
    }
}

class threadC implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("From thread C with i= " + ((2 * i) - 1));
        }
        System.out.println("Exiting from Thread C...");
    }
}

public class demons_112 {
    public static void main(String[] args) {
        threadA a = new threadA();
        Thread t1 = new Thread(a);
        /*
         * created Thread class object and passing a runnable object(as Thread class has
         * that type of constructor)
         */

        threadB b = new threadB();
        Thread t2 = new Thread(b);

        Thread t3 = new Thread(new threadC());

        t1.start();
        t2.start();
        t3.start();
        System.out.println("Multi-threading is over\nExiting from main...");
    }
}

/*
 * The three threads runs concurrently but they are displayed in a different
 * order.
 */