/*run the following program without exception handling mechanism */

class demons_103 {
    static int anyFunction(int x, int y) {
        int a = x / y;
        return a;
    }

    public static void main(String[] args) {
        int a, b, result;
        a = 0;
        b = 0;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        result = anyFunction(a, b);
        System.out.println("Result: " + result);

    }
}

/*
 * NOTE:
 * input:-
 * 200 10 : (ok)
 * 10 0 : (Arithmetic exception)
 */