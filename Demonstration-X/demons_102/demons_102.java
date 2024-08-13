/*showing runtime errors in a program. */

class demons_102 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a / b;
        System.out.println("value of c: " + c);
    }
}

/* Run this program with the following command line arguments: */
/*
 * 1 2
 * 10 20 30
 * 40 - error
 * 4.5 5 - error
 */