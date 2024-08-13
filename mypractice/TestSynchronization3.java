/*Java Synchronized Method: 
If you declare any method as synchronized, it is known as synchronized method. */
// When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.

//Using annonymous class
class table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread executing : " + Thread.currentThread().getName());
            System.out.println(n * i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

/**
 * TestSynchronization3
 */
public class TestSynchronization3 {
    public static void main(String[] args) {
        final table t = new table();
        Thread t1 = new Thread() {
            public void run() {
                t.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                t.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}