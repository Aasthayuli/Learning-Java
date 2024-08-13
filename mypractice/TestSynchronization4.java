/*
 * Static Synchronization: If you make any static method as synchronized, the
 * lock will be on the class not on object.
 * Problem without static synchronization:
 * Suppose there are two objects of a shared class (e.g. Table) named object1
 * and object2.
 * In case of synchronized method and synchronized block there cannot be
 * interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to
 * a common object that have a single lock.
 * But there can be interference between t1 and t3 or t2 and t4 because t1
 * acquires another lock and t3 acquires another lock.
 * We don't want interference between t1 and t3 or t2 and t4.
 * Static synchronization solves this problem.
 */

class Table2 {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
}

class MyThreadA extends Thread {
    public void run() {
        Table2.printTable(1);
    }
}

class MyThreadB extends Thread {
    public void run() {
        Table2.printTable(10);
    }
}

class MyThreadC extends Thread {
    public void run() {
        Table2.printTable(100);
    }
}

class MyThreadD extends Thread {
    public void run() {
        Table2.printTable(1000);
    }
}

public class TestSynchronization4 {
    public static void main(String t[]) {
        MyThreadA t1 = new MyThreadA();
        MyThreadB t2 = new MyThreadB();
        MyThreadC t3 = new MyThreadC();
        MyThreadD t4 = new MyThreadD();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}