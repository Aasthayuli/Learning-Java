/*Example-2 of private access modifier */


class A{
    private int data=10;
    public void msg(){System.out.println("Class A: Hello Java ");}
}

public class demons_78{
    public static void main(String[] args) {

        // private int data2=100;//error: private data in the same class  demons_78 is not accessible
        // public int data3=200;//error: public data in the same class demons_78  is not accessible
        int data4=400;
        A obj = new A(); //ok: class A is default
        System.out.println("class B:"+ data4);  //ok: default data in the same class
        obj.msg();                             //private data is accessible through public method
    }
}