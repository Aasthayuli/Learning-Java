/*Example of method-overriding */
/*In Java ,We Cannot reduce the visibility of the inherited method or the method that is going to be overridden.*/
/*Visibility order: public > protected > default > private */
class A {
    void msg() {
        System.out.println("class A: default!");
    }

    public void msg1() {
        System.out.println("class A: public!");
    }

    private void msg2() {
        // the warning shown here: the method is never used locally means
        // it cannot be called and used in the
        // local class as well as outside the class
        System.out.println("class A: private!");
    }

    protected void msg3() {
        System.out.println("class A: protected!");
    }
}

public class demons_716 extends A {
    void msg() {
        System.out.println("overriding default method! by default");
    }

    public void msg1() { // if modifier is set to default it cannot override
        System.out.println("overriding public method! by public");
    }

    void msg2() {
        System.out.println("overriding private method! by default");
    }

    // if modifier is set to default or private it cannot be overridden
    public void msg3() {
        System.out.println("overriding protected method! by public");
    }

    public static void main(String[] args) {
        demons_716 obj = new demons_716();
        obj.msg();
        obj.msg1();
        obj.msg2();
        obj.msg3();
    }
}
