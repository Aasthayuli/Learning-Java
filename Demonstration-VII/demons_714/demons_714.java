/*simple example of access modifier.In a class hierarchy, private members remain private to their class
 * This program contains an error and will not compile.
 */

 //create a superclass
 class A{
    int i;   //public by default
    // private int j;  //private to A   //causes error at line no. 20
    protected int j;   //runs successfully
    void setij(int x, int y){
        i=x;
        j=y;
    }
 }

 //A's j is not accessible here
 class B extends A{
    int total;
    void sum(){
        total=i+j;//j is not accessible here
    }
 }

 class demons_714{
    public static void main(String args[]){
         B subob=new B();
         subob.setij(10,12);
    }
 }