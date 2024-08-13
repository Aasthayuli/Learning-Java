//Example of Fibonacci Sequence

public class recursiveFibonacci {
    int n;

    int fib(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return (fib(num - 1) + fib(num - 2));
        }
    }

    // using command line argument to take input from user
    public static void main(String args[]) {
        recursiveFibonacci x = new recursiveFibonacci();
        x.n = Integer.parseInt(args[0]);
        System.out.println("Fibonacci sequence of " + x.n + " numbers: ");
        for (int i = 0; i < x.n; i++) {
            System.out.println(+x.fib(i));
        }  
    }
}
