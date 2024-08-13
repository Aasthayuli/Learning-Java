package mypackage1;

// import mypackage1.X;

public class A {
    public A() {
        X x = new X();
        System.out.println("Same package constructor...");
        System.out.println("n from A " + x.n);

        // System.out.println("p from A "+x.p); //Error! private is not accessible
        // default variables is accessible in the same package
        System.out.println("q from A " + x.q); // protected is accessible in the same package
        System.out.println("r from A " + x.r); // ok: public is accessible
    }
}
