//An abstract class with constructor

abstract class Base{
    Base(){System.out.println("Base constructor is called!");}
    abstract void fun();
}

class Derived extends Base{
    Derived(){
        super();            //calling the base class constructor explicitly.Also if it is not called explicitly, the base class constructor will be called implicitly.
        System.out.println("Derived constructor is called!");}
    // super();             //This is gonna create an error coz it is not inside the constructor
    void fun(){System.out.println("Derived fun() is called!");}
}

class demons_69{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();
    }
}