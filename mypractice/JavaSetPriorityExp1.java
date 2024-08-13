/*The setPriority() method of thread class is used to change the thread's priority. Every thread has a priority which is represented by the integer number between 1 to 10.

Thread class provides 3 constant properties:
public static int MIN_PRIORITY: It is the maximum priority of a thread. The value of it is 1.
public static int NORM_PRIORITY: It is the normal priority of a thread. The value of it is 5.
public static int MAX_PRIORITY: It is the minimum priority of a thread. The value of it is 10. 

We can also set the priority of thread between 1 to 10. */

// Example 1: Maximum Priority Thread
public class JavaSetPriorityExp1 extends Thread {
    public void run() {
        System.out.println("Priority of thread is: " + Thread.currentThread().getPriority()
                + " running thread name is: " + Thread.currentThread().getName());
        // getName():It returns the name of the thread.
    }

    public static void main(String args[]) {
        // creating one thread
        JavaSetPriorityExp1 t1 = new JavaSetPriorityExp1();
        // print the maximum priority of this thread
        t1.setPriority(Thread.MAX_PRIORITY);
        // call the run() method
        t1.start();

        JavaSetPriorityExp1 t2 = new JavaSetPriorityExp1();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

        JavaSetPriorityExp1 t3 = new JavaSetPriorityExp1();
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();
    }
}

// Example 5: When priority is greater than 10
// Throws error
// public class JavaSetPriorityExp1 extends Thread {
// public void run() {
// System.out.println("running...");
// }

// public static void main(String args[]) {
// // creating one thread
// JavaSetPriorityExp1 t1 = new JavaSetPriorityExp1();
// JavaSetPriorityExp1 t2 = new JavaSetPriorityExp1();
// // set the priority
// t1.setPriority(12);
// t2.setPriority(7);
// // print exception because priority of t1 is greater than 10
// System.out.println("Priority of thread t1 is: " + t1.getPriority());
// System.out.println("Priority of thread t2 is: " + t2.getPriority());
// // call the run() method
// t1.start();
// }
// }