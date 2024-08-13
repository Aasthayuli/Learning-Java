/*creating three threads using the class Thread and then running them concurrently. */

class threadA extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("From thread A with i= " + (-1 * i));
        }
        System.out.println("Exiting from Thread A...");
    }
}

class threadB extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("From thread B with i= " + (2 * i));
        }
        System.out.println("Exiting from Thread B...");
    }
}

class threadC extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("From thread C with i= " + ((2 * i) - 1));
        }
        System.out.println("Exiting from Thread C...");
    }
}

public class demon_111 {
    public static void main(String[] args) {
        threadA a = new threadA();
        threadB b = new threadB();
        threadC c = new threadC();

        a.start();
        b.start();
        c.start();
        System.out.println("Multi-threading is over\nExiting from main...");
    }
}