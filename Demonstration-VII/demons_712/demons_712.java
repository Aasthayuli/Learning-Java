//Example-3: Java probgram to illustrate protected modifier


class A{
    protected void display(){System.out.println("NPTEL");}
}

//classs demons_712 is a subclass of class A
class demons_712 extends A{
    public static void main(String args[]){
        A obj = new A();
        obj.display();
    }
}