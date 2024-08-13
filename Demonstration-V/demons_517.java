/*Example of Recursion */

class demons_517 {
    static void mymethod(int counter) {
        if (counter == 0) {
            return;
        } else {
            System.out.println("Hello" + counter);
            mymethod(--counter);
            System.out.println(counter);
            return;
        }
    }

    public static void main(String args[]) {
        mymethod(10); //pass positive integers
    }
}