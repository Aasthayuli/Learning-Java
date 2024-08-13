/*The destroy() method of thread class is used to destroy the thread group and all of its subgroups. The thread group must be empty, indicating that all threads that had been in the thread group have since stopped. */

public class JavaDestroyExp extends Thread   
{  
    JavaDestroyExp(String threadname, ThreadGroup tg)  
    {  
        super(tg, threadname);  
        start();  
    }  
    public void run()  
    {  
        for (int i = 0; i < 2; i++)   
        {  
            try  
            {  
                Thread.sleep(10);  
            }  
            catch (InterruptedException ex) {  
                System.out.println("Exception encounterted");}  
        }  
        System.out.println(Thread.currentThread().getName() +  
              " finished executing");  
    }  
    public static void main(String arg[]) throws InterruptedException, SecurityException  
    {  
        // creating a ThreadGroup  
        ThreadGroup g1 = new ThreadGroup("Parent thread");  
        // creating a child ThreadGroup for parent ThreadGroup  
        ThreadGroup g2 = new ThreadGroup(g1, "child thread");  
          
        // creating a thread   
        JavaDestroyExp t1 = new JavaDestroyExp("Thread-1", g1);  
        // creating another thread   
        JavaDestroyExp t2 = new JavaDestroyExp("Thread-2", g1);  
          
        // block until other thread is finished  
        t1.join();  
        t2.join();  
   
        // destroying child thread  
        g2.destroy();  
        System.out.println(g2.getName() + " destroyed");  
          
        // destroying parent thread  
        g1.destroy();  
        System.out.println(g1.getName() + " destroyed");  
    }  
}  