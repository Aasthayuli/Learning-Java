import java.util.Scanner;

class demons_45{
    public static void main(String[] args){
        Scanner scnr=new Scanner(System.in);
        System.out.println("Please Enter two numbers to find maximum of two: ");
        int a=scnr.nextInt();
        int b=scnr.nextInt();
        if(a>b){
            System.out.printf("Between %d and %d, Maximum is %d\n",a,b,a);
        }
        else{
            System.out.printf("Between %d and %d, Maximum is %d\n",a,b,b); 
        }
        scnr.close();
    }
}