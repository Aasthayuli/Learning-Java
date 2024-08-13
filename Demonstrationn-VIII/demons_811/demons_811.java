// import mypackage1.myclass;
// import mypackage2.myclass;     
//writing both in the code will lead to error as bcoz of same class name collison
//although using fully qualified name will be okay to use

public class demons_811 {

    public static void main(String[] args) {
        mypackage1.myclass obj1 = new mypackage1.myclass();
        obj1.msg1();
        mypackage2.myclass obj2 = new mypackage2.myclass();
        obj2.msg2();
        /*
         * writing both in the code will lead to error as bcoz of same class name
         * collison
         */
    }
}