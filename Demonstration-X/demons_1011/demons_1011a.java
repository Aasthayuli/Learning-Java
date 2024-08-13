/*Necessity of nested try-catch example */

class demons_1011a {
    public static void main(String[] args) {
        try { // try outer
            int a = args.length;
            int b = 42 / a; // Divide by zero exception
            System.out.println("a= " + a);
            if (a == 1) {
                a = a / (a - 1); // Another divide by zero exception
            }
            try { // try inner
                if (a == 2) {
                    int c[] = { 1 };
                    c[2] = 99; // out of bound exception, if two arguments
                }
            } catch (ArrayIndexOutOfBoundsException e) { // catch inner
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        } catch (ArithmeticException e) { // catch outer
            System.out.println("ArithmeticException:Divide by Zero");
        }
    }
}

/*
 * NOTE:
 * Run the following program with following inputs
 * 1 2 3
 * 1 2
 * 1
 * 
 */