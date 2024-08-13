/*
 * The getId() method is used to return the thread identifier. The thread ID is
 * a unique positive number which was generated at the time of thread creation.
 * The thread ID remains unchanged during its lifetime. When the thread is
 * terminated, the ID of thread can be reused.
 */

public class GetIdExample extends Thread  
{    
    public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {    
        // creating one thread  
        GetIdExample t1=new GetIdExample();    
        // Returns the identifier of this Thread  
        System.out.println("Name of t1: "+t1.getName());  
        System.out.println("Id of t1: "+t1.getId());   
        // Start the thread   
        t1.start();  
    }    
}   
