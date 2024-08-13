/*Example-1 protected modifier */

 class A{     //class cannot be declared protected 
    protected int roll=555;
    protected void msg(){System.out.println("class A: Hello Java!"+roll);}
}

class demons_710{
    public static void main(String args[]){
        A obj=new A();
        obj.msg();      //but we can access protected method as it is in the same class
        System.out.println(obj.roll); //error: Itis not accessible as it is protected
    }
}