/*Another example of access modifier with public , private, and protected */

class Baseclass{
    public int x=10;
    private int y=10;
    protected int  z=10;
    int a=10;  //implicit default access modifier
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    private int getY(){
        return y;
    }
    private void setY(int y){
        this.y=y;
    }
    protected int getZ(){
        return x;
    }
    protected void setZ(int z){
        this.z=z;
    }
    int getA(){
        return x;
    }
    void setA(int a){
        this.a=a;
    }
}

public class demons_715 extends Baseclass{
    public static void main(String[] args) {
        Baseclass rr=new Baseclass();
        rr.z=25;
        System.out.println("value of x for baseclass object rr is:"+rr.x);
        demons_715 subClassobj=new demons_715();

        //access modifier -public
        System.out.println("\nFor object of sub class(demons_715):-");
        System.out.println("value of x is:"+subClassobj.x);
        subClassobj.setX(20);
        System.out.println("value of x is:"+subClassobj.x);

        //access modifier -private
        //If we remove the comments it would result in a compilation error as the fields and methods being accessed are private.
        /*System.out.println("value of y is:"+subClassobj.y);
         * subobj.setY(20);
         * System.out.println("value of y is:"+subClassobj.y);
        */

        //access modifier -protected
        System.out.println("value of z is:"+subClassobj.z);
        subClassobj.setZ(30);
        System.out.println("value of z is:"+subClassobj.z);

        //access modifier -default
        System.out.println("value of a is:"+subClassobj.a);
        subClassobj.setA(40);
        System.out.println("value of a is:"+subClassobj.a);
    }
}