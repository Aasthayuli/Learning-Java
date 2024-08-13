//Accessing a package from a java in-built API package

// import java.lang.*;  //Math class is defined in this package

class calculator {
    double num;
    double result;

    void squareRoot() {
        result = Math.sqrt(num);
        /*
         * For using the Math class, we don't have to create any object coz it is
         * defined static in the package.
         */
    }
}

/**
 * demons_81
 */
public class demons_81 {

    public static void main(String[] args) {
        calculator obj = new calculator();
        obj.num = 20;
        obj.squareRoot();
        System.out.println("Square root of " + obj.num + " is " + obj.result);
    }
}