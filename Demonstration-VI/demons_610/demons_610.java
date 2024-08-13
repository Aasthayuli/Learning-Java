/*An abstract class without any abstract methods */

abstract class Base{
    void fun(){System.out.println("Base fun() is called!");}
}

class Derived extends Base{
    Derived(){System.out.println("Derived constructor is called!");}
    void fun(){System.out.println("Derived fun() is called!");}
}
// class Derived extends Base{
//     Derived(){System.out.println("Derived constructor is called!");}
//     void fun(){
//           super.fun();  //this will call Base class fun() as well
//           System.out.println("Derived fun() is called!");}
// }


class demons_610 {
    public static void main(String[] args) {
        Derived d=new Derived();  //static binding takes place 
        d.fun();                  //and derived fun() is called
    }
}