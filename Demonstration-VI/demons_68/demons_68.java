/*A Simple abstract class Example */

abstract class Base{
    abstract void fun();
}

class Derived extends Base{
    void fun(){System.out.println("Derived fun is called!");}
}

class demons_68{
    public static void main(String[] args) {
        // Uncommenting the follwing line will cause compilation error as the line tries to create the instance of abstract class
        // Base b=new Base();

        //We can have references of Base type
        Base b=new Derived();
        b.fun();
    }
}