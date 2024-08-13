/*Example of super to overcome name hiding */

class A{
    int i;
}

class B extends A{
    int i;  //this hides the i in A
    B(int a, int b){
        super.i=a; //i in A
        i=b;  //i in B
    }

    void show(){
        System.out.println("i in superclass: "+super.i);
        System.out.println("i in subclass: "+i);
    }
}

class demons_65{
    public static void main(String[] args){
        B subob= new B(1,2);
        subob.show();
    }
}