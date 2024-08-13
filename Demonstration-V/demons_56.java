import java.util.Scanner;

class demons_56{
    public static void main(String args[]){
        Scanner scnr=new Scanner(System.in);
        int num=scnr.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println("num is divisible by : "+i);
                isPrime=false;
                break;
            }
        }
        if(isPrime){System.out.println("Number is Prime!");}
        else{System.out.println("Number is not Prime!");}
        scnr.close();
    }
}