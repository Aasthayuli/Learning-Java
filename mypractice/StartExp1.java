/*The start() method of thread class is used to begin the execution of thread.
 * The result of this method is two threads that are running concurrently: the current thread (which returns from the call to the start method) and the other thread (which executes its run method).

The start() method internally calls the run() method of Runnable interface to execute the code specified in the run() method in a separate thread.

IllegalThreadStateException - This exception is thrown if the start() method is called more than one times.
 */

public class StartExp1 extends Thread { // can also be implemented by implementing Runnable interface
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String args[]) {
        StartExp1 t1 = new StartExp1();
        // this will call run() method
        t1.start();
    }
}