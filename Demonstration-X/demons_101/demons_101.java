/*showing compile time errors ina program. */
/*can be done by doing syntax errors! */

class error {
    public static void main(String args[]) {
        System.out.println("hello");
    }
}

class anotherError {
    public void insert() {
        System.out.println("to insert a text");
    }

    // abstract void delete(){
    // abstract method can be defined only in abstract class
    // System.out.println("to delete a text");
    // }
}

/*
 * NOTE:
 * A class file can be compiled successfully , if it is syntactically correct.
 * Even , if there is no main class , i.e., without main() method
 */