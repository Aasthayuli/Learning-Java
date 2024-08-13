/*Example 2 of multiple inheritance */

class A {
    protected int i = 1000;

    public void print() {
        System.out.println("I am from class A" + i);
    }
}

interface C {
    public static int j = 555;

    void printInterfaceC();
}

interface D {
    public static int k = 666;

    void printInterfaceD();
}

class B extends A implements C, D {
    public int aValue = 999;

    public void printInterfaceC() {
        System.out.println("I am from class C" + j);
    }

    public void printInterfaceD() {
        System.out.println("I am from class D" + k);
    }

    public void printB() {
        super.print();
        printInterfaceC();
        printInterfaceD();
    }
}

/**
 * demons_910
 */
public class demons_910 {

    public static void main(String[] args) {
        B b = new B();
        b.printB();
    }
}