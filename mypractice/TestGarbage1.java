public class TestGarbage1 {
    public void finalize() {
        System.out.println("object is being garbage collected");
    }

    public static void main(String args[]) {
        TestGarbage1 s1 = new TestGarbage1();
        TestGarbage1 s2 = new TestGarbage1();
        s1 = null;
        s2 = null;
        System.gc();
    }
}


   /*When you invoke the gc() method in Java, it does not directly trigger the garbage collection process. Instead, it sends a request to the JVM (Java Virtual Machine) to perform garbage collection. The JVM decides when to actually run the garbage collector. */