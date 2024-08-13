package mypackage1;

public class Y extends X {
    public Y() {
        // super();
        System.out.println("I am constructor from class y:");
        System.out.println("n=" + n);
        // System.out.println("p=" + p); //error: p is private
        System.out.println("q=" + q); // protected is accessible
        System.out.println("r=" + r); // public is accessible
    }
}

/*
 * When you compile Y.java, the compiler needs to be able to find the X.class
 * file.
 * Since X.class is in the same directory,
 * you need to tell the compiler to look for classes in the current directory.
 */

/* so. in order to compile Y.java and X.java, you need to run "javac *.java" */