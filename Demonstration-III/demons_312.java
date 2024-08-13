/*Use of this keyword to invoke current class method within the same class. */

class A{

    void m(){
        System.out.println("Called function m()!");
    }

    void n(){
        System.out.println("Called function n()!");
        System.out.println("and within this function m() is called below!");
        this.m();
    }
}

class demons_312{
    public static void main(String args[]){
        A a1=new A();
        a1.m();
        a1.n();
    }
}