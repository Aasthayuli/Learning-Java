/*The getPriority() method of thread class is used to check the priority of the thread. When we create a thread, it has some priority assigned to it. Priority of thread can either be assigned by the JVM or by the programmer explicitly while creating the thread.

The thread's priority is in the range of 1 to 10. The default priority of a thread is 5. */

public class JavaGetPriorityExp extends Thread  
{    
    public void run()  
    {    
        System.out.println("running thread name is:"+Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        // creating two threads  
        JavaGetPriorityExp t1 = new JavaGetPriorityExp();    
        JavaGetPriorityExp t2 = new JavaGetPriorityExp();    
        // print the default priority value of thread  
        System.out.println("t1 thread priority : " + t1.getPriority());   
        System.out.println("t2 thread priority : " + t2.getPriority());  
        // this will call the run() method  
        t1.start();    
        t2.start();  
    }    
}     