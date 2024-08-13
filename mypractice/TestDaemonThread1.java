/*Points to remember for Daemon Thread in Java:
It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
Its life depends on user threads.
It is a low priority thread. */

public class TestDaemonThread1 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {// checking for daemon thread
            System.out.println("daemon thread working !");
        } else {
            System.out.println("user thread working !");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread1 t1 = new TestDaemonThread1();// creating thread
        TestDaemonThread1 t2 = new TestDaemonThread1();
        TestDaemonThread1 t3 = new TestDaemonThread1();

        t1.setDaemon(true);// now t1 is daemon thread

        t1.start();// starting threads
        t2.start();
        t3.start();
    }
}

// If you want to make a user thread as Daemon, it must not be started otherwise
// it will throw IllegalThreadStateException.
// The folllowing code will throw exception.
// class TestDaemonThread1 extends Thread {
// public void run() {
// System.out.println("Name: " + Thread.currentThread().getName() + " ");
// System.out.println("Daemon: " + Thread.currentThread().isDaemon());
// }

// public static void main(String[] args) {
// TestDaemonThread1 t1 = new TestDaemonThread1();
// TestDaemonThread1 t2 = new TestDaemonThread1();
// t1.start();
// t1.setDaemon(true);// will throw exception here
// t2.start();
// }
// }