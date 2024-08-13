/*The currentThread() method of thread class is used to return a reference to the currently executing thread object. */

public class CurrentThreadExp extends Thread  
{    
    public void run()  
    {    
        // print currently executing thread   
        System.out.println(Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        // creating two thread  
        CurrentThreadExp t1=new CurrentThreadExp();    
        CurrentThreadExp t2=new CurrentThreadExp();    
        // this will call the run() method  
        t1.start();    
        t2.start();    
    }    
}  