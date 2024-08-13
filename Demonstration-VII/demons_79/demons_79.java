class A{
    // private A(){
    //     //private constructor
    // }

    public A(){
        //public constructor works!
    }
    void msg(){System.out.println("class A: Hello Java");}
}

public class demons_79{
    public static void main(String[] args){
        A obj=new A();  //causes compile time error coz constructor is private and hence can't be instantiated
        obj.msg();
    }
}