/*Java program to demonstrate the access of particular class from any package. */

import java.util.Vector;

class demons_82 {
    public demons_82() {
        /*
         * java.util.Vector is imported , hence we are able to access directly in our
         * code
         */
        Vector<String> newVector = new Vector<>();
        // newVector.add("Element 1");
        // newVector.add("Element 2");
        // code dealing with the vector
    }

    public static void main(String[] args) {
        // main Class code
        demons_82 obj = new demons_82();
    }
}