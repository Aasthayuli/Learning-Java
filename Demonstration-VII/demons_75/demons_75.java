/*Example-1 of public access modifier */

class A {
    public int data = 40;

    public void msg() {
        System.out.println("class A: Hello Java.");
    }
}

// public class A{
// public int data=40;
// public void msg(){System.out.println("class A: Hello Java.");}
// }
// declaring class A as public within the same file will give an error

public class demons_75 {
    public static void main(String[] args) {
        A obj = new A(); // ok:class A is public
        System.out.println(obj.data); // ok: data is public
        obj.msg(); // ok: msg() is public
    }
}