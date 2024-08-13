/*Example -1 of default access modifier */

//save the following classes in the same file named as demons_71.java

class A{
    void msg(){System.out.println("Hi! I am in class A");}
}

class demons_71{
    public static void main(String[] args) {
        A obj=new A();
        obj.msg();
    }
}

//This code works properly but problem occurs when classes are kept in different files.
//As a good programmer, classes should be kept in differnt file which will be for classes only.
