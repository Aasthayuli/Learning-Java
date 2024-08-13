/*data race example */

public class demons_118 extends Thread {
    public static int x;

    public void run() {
        for (int i = 0; i < 100; i++) {
            x = x + 1;
            x = x - 1;
        }
    }

    public static void main(String args[]) {
        x = 0;
        for (int i = 0; i < 1000; i++) {
            new demons_118().start();
            if (x == 1) {
                System.out.print(" Here it is ");
            } else {
                System.out.print(x);
            }
        }
    }
}