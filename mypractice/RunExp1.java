/* When the run() method calls, the code specified in the run() method is executed. You can call the run() method multiple times.

The run() method can be called using the start() method or by calling the run() method itself. But when you use run() method for calling itself, it creates problems. */

//Example 1: call the run() method using the start() method
// public class RunExp1 implements Runnable {
//     public void run() {
//         System.out.println("Thread is running...");
//     }

//     public static void main(String args[]) {
//         RunExp1 r1 = new RunExp1();
//         Thread t1 = new Thread(r1);
//         // this will call run() method
//         t1.start();
//     }
// }

//Example 2: call the run() method using the run() method itself
//In this case, it goes to the current call stack rather than at the beginning of a new call stack.

// public class RunExp1 extends Thread {
//     public void run() {
//         System.out.println("running...");
//     }

//     public static void main(String args[]) {
//         RunExp1 t1 = new RunExp1();
//         // It does not start a separate call stack
//         t1.run();
//     }
// }

//Example 3: call the run() method more than one time

public class RunExp1 extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        RunExp1 t1 = new RunExp1();
        RunExp1 t2 = new RunExp1();
        t1.run();
        t2.run();
    }
}
