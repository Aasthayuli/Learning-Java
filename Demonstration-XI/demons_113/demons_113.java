/*Demonstration of thread class methods:getId() */
/*java code for thread creation by extending the Thread class */

class threadId extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread: " + Thread.currentThread().getId() + " is running !");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught !");
        }
    }
}

public class demons_113 {
    public static void main(String[] args) {
        int n = 8; // No. of threads
        for (int i = 0; i < n; i++) {
            threadId object = new threadId();
            object.start();
        }
    }
}