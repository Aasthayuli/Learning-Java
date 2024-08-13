package mypackage2;

// import mypackage1.*;

public class B {
    public B() {
        mypackage1.X x = new mypackage1.X();// created an object of X class

        System.out.println("I am constructor from class B from mypackage2");
        // System.out.println("n from B from mypackage2 " + x.n); //Error! default
        // variables are not accessible outside their package

        // System.out.println("p from B from mypackage2 " + x.p); //Error! private is
        // not accessible
        // protected members are accessible only by inheritance outside their package
        // System.out.println("q from B from mypackage2 " + x.q); // error: protected is
        // not accessible as B is not the subclass of X

        System.out.println("r from B from mypackage2 " + x.r); // ok: public is accessible
    }

}
