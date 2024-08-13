/*Use of suspend() and resume() */

class thread1 extends Thread {
    public void run() {
        try {
            System.out.println("First thread starts running");
            sleep(10000);
            System.out.println("First thread finishes running");
        } catch (Exception e) {
            System.out.println("First thread caught interrupted exception");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        try {
            System.out.println("Second thread starts running");
            System.out.println("second thread is suspended by wait() itself");
            suspend();
            // wait(); //works with sychronization
            System.out.println("Second thread finishes running");
        } catch (Exception e) {
            System.out.println("Second thread caught exception");
        }
    }
}
// The suspend() method was previously used to suspend a thread's execution, but
// it has been deprecated because it's prone to deadlock. When a thread is
// suspended, it holds onto all the locks it has acquired, which can cause other
// threads to block indefinitely, leading to deadlocks.

// Additionally, suspend() doesn't release any system resources, so it can lead
// to resource starvation.

// Instead of suspend(), you can use higher-level concurrency utilities, such as
// wait() and notify() or Lock and Condition objects, to implement thread
// suspension and resumption in a safe and efficient manner.

/**
 * demons_116
 */
public class demons_116 {

    public static void main(String[] args) {
        try {
            thread1 t1 = new thread1(); // new born thread (in new born state)
            thread2 t2 = new thread2(); // new born thread (in new born state)
            t1.start(); // first is scheduled for running
            t2.start(); // second is scheduled for running
            System.out.println("Reviving the second thread");
            t2.resume();
            // The resume() method was previously used to resume a thread that was suspended
            // using the suspend() method.
            // The reason for deprecating resume() is similar to that of suspend(): it's
            // prone to deadlock and can lead to resource starvation. When a thread is
            // resumed, it may not be in a consistent state, and it may hold onto locks,
            // causing other threads to block indefinitely.
            // t2.notify(); //works with sychronization
            System.out.println("Second thread went for 10seconds sleep");
            t2.sleep(10000);

            System.out.println("Wake up the second thread and finishes running");
            System.out.println("Demonstration is finished");
        } catch (Exception e) {
        }

    }
}