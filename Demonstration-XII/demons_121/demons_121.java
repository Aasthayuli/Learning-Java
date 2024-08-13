
/*User input using Scanner class */
// import java.util.Scanner;

// class demons_121 {
//     public static void main(String[] args) {
//         double principalAmount = 0.0;
//         double interestRate = 0.0;
//         int noOfYears = 0;

//         Scanner scnr = new Scanner(System.in);
//         System.out.print("Enter principal amount: ");
//         principalAmount = scnr.nextDouble();
//         System.out.print("Enter rate of Interest: ");
//         interestRate = scnr.nextDouble();
//         System.out.print("Enter Number of years: ");
//         noOfYears = scnr.nextInt();

//         System.out.println("The interest is: " + (principalAmount * interestRate * noOfYears));
//     }
// }

// Taking input using DataInputStream class object
import java.io.*;

/**
 * demons_121
 */
public class demons_121 {

    public static void main(String[] args) {
        double principalAmount = 0.0;
        double interestRate = 0.0;
        int noOfYears = 0;

        try {
            DataInputStream in = new DataInputStream(System.in);
            String tempStr;
            System.out.print("Enter principal amount: ");
            System.out.flush(); // to clean the buffer
            tempStr = in.readLine();
            principalAmount = Float.valueOf(tempStr);
            System.out.print("Enter rate of Interest: ");
            System.out.flush();
            tempStr = in.readLine();
            interestRate = Float.valueOf(tempStr);
            System.out.print("Enter Number of years: ");
            System.out.flush();
            tempStr = in.readLine();
            noOfYears = Integer.parseInt(tempStr);
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Input calculation is over

        double TotalInterest = (principalAmount * interestRate * noOfYears);
        System.out.println("The interest is: " + TotalInterest);
    }
}