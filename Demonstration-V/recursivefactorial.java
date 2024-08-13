import java.util.Scanner;

public class recursivefactorial {

  int n;

  int fact(int num) {
    if (num == 0) {
      return 1;
    } else {
      return (num * fact(num - 1));
    }
  }

  public static void main(String[] args) {

    // using Scanner class to take input from user
    recursivefactorial x = new recursivefactorial();
    System.out.println("Enter number for factorial calculation: ");
    Scanner scnr = new Scanner(System.in);
    int n = scnr.nextInt();
    int factorial = x.fact(n);
    System.out.println("Factorial of input number " + n + " = " + factorial);
    scnr.close();

    // using command line argument to take input from user
    // recursivefactorial x = new recursivefactorial();
    // x.n = Integer.parseInt(args[0]);
    // System.out.println("Factorial of " + x.n + ": " + x.fact(x.n));
  }
}