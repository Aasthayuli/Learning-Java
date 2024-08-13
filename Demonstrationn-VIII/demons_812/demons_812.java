/*Derive a sub-class in a program to be run from demons_812 */

import mypackage.Balance;

class savings extends Balance {
    String Branch;
    int customerID;

    public savings(String n, double b, String br, int cid) {
        super(n, b);
        Branch = br;
        customerID = cid;
    }

    public void show() { // overriden method
        if (bal < 0) {
            System.out.println("\nSorry ! " + name + " You have a Negative Balance. ");
        }
        System.out.println(name + ": $" + bal + " Branch: " + Branch + " Customer ID: " + customerID);
    }
}

/**
 * demons_812
 */
public class demons_812 {

    public static void main(String[] args) {
        savings current[] = new savings[3];
        current[0] = new savings("John", 1000, "Mumbai", 123);
        current[1] = new savings("Tom", 2000, "Pune", 456);
        current[2] = new savings("Jane", -3000, "Delhi", 789);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}