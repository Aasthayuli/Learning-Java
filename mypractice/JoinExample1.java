/*
 * The join() method of thread class waits for a thread to die.
 * It is used when you want one thread to wait for completion of another.
 * Syntax:
 * public final void join()throws InterruptedException
 * public void join(long millis)throwsInterruptedException
 * public final void join(long millis, int nanos)throws InterruptedException
 * millis: It defines the time to wait in milliseconds
 * nanos: 0-999999 additional nanoseconds to wait
 */

//  public class JoinExample1 extends Thread  
// {    
//     public void run()  
//     {    
//         for(int i=1; i<=4; i++)  
//         {    
//             try  
//             {    
//                 Thread.sleep(500);    
//             }catch(Exception e){System.out.println(e);}    
//             System.out.println(i);    
//         }    
//     }    
//     public static void main(String args[])  
//     {   
//         // creating three threads  
//         JoinExample1 t1 = new JoinExample1();    
//         JoinExample1 t2 = new JoinExample1();    
//         JoinExample1 t3 = new JoinExample1();    
//         // thread t1 starts  
//         t1.start();   
//         // starts second thread when first thread t1 is died.  
//         try  
//         {    
//             t1.join();    
//         }catch(Exception e){System.out.println(e);}    
//         // start t2 and t3 thread   
//         t2.start();   
//         t3.start();    
//     }    
// }

public class JoinExample1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        // creating three threads
        JoinExample1 t1 = new JoinExample1();
        JoinExample1 t2 = new JoinExample1();
        JoinExample1 t3 = new JoinExample1();
        // thread t1 starts
        t1.start();
        // starts second thread when first thread t1 is died.
        try {
            t1.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        // start t2 and t3 thread
        t2.start();
        t3.start();
    }
}
