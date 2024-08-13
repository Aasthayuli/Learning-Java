//Attempting to create an object of interface

class demons_92 {
    public static void main(String[] args) {
        // C c1 = new C(); // Error: cannot instantiate an interface object

        C c2; // OK: Declaration of an object is possible

        C c3[] = new C[3];// This is also OK:Declaration of array of objects for interface is permitted.
    }
}