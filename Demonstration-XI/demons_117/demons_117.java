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

/*
 * Even though you've set the priorities of the threads, the output is still
 * random because thread scheduling is not guaranteed to follow the priority
 * order.
 * 
 * In Java, thread priorities are only a hint to the scheduler, and the
 * scheduler is free to ignore them. The scheduler's primary goal is to ensure
 * that all threads get a fair share of CPU time, regardless of their
 * priorities.
 * 
 * There are several reasons for this:
 * 
 * Context switching: The scheduler can switch between threads at any time, even
 * if a higher-priority thread is waiting to run. This can lead to interleaved
 * output from multiple threads.
 * Time slicing: The scheduler allocates a time slice (also known as a time
 * quantum) to each thread. Even if a thread has a higher priority, it will only
 * run for its allocated time slice before the scheduler switches to another
 * thread.
 * Platform-dependent behavior: The behavior of the scheduler can vary depending
 * on the underlying platform, JVM implementation, and system load.
 */