/*
 * We have learnt that a class must implement an interface and then that class
 * will be used as a normal class.
 * However, the reverse is not true.
 * that is, an interface cannot implement another interface
 */

interface I1 {
    public static int i = 555;

    void printInterface();
}

// the following code is invalid!

// interface I2 implements I1{
// public static int j=111;
// public void printInterface(){
// System.out.println("I am implementing an interface");
// }
// }

// This is OK!
class I2 implements I1 {
    public static int j = 111;

    public void printInterface() { // for default method, while overriding it should be public.
        System.out.println("I am implementing an interface");
    }
}