//An abstract class with a final method

abstract class Base{
    final void fun(){
        System.out.println("final fun() is called!");
    }
}

class Derived extends Base{}

class demons_612a{
    public static void main(String[] args){
        Base b=new Derived();
        b.fun();
        //It will run the final method fun() of base class coz the method is not overridden in derived class 
    }
}