interface I1 {
    public static final double PI = 3.1413434567; // OK
    static final double lambda = 0.04; // OK: public is implicit

    // int x; //Declaration of any instance variable is not allowed
    int x = 100; // Initialisation of a variable is necessary

    // private static final int p=444; //ERROR:private/protected is not allowed.
    // abstract public static void methodI1(); //static method is not allowed

    void methodI2(); // public and abstract by default
}

class A1 implements I1 {
    public int a1 = 555;

    public void methodI1() {
        System.out.println("From I1: " + PI);
    }

    public void methodI2() {
        System.out.println("Again From I1 via class A1: " + lambda);
    }
}

public class demons_93 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.methodI1();
        a.methodI2();
    }
}