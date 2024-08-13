/*An Interface method cannot be made final */

interface I1 {
    public static int i = 555;

    // public final static void printInterface(); //Error!
    void printInterface();
}

// The following code is invalid!

class demons_96 implements I1 {
    public static int j = 111;

    public void printInterface() {
        System.out.println("geek!");
    }
}