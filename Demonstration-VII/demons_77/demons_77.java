
/*Example-1 of private access modifier */

class A {
    private int data = 10;

    public void msg() {
        System.out.println("Class A: hello Java...");
    }
}

class demons_77 {
    public static void main(String args[]) {
        A obj = new A(); // ok : class A is default
        // System.out.println(obj.data); //Compile time error:data is private
        obj.msg(); // ok: msg () is public
    }
}