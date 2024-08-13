class demons_42{
    public static void main(String[] args){

        int x=100;
        System.out.printf("printing Simple integer: x=%d\n",x);

        //this will print upto 2 decimal places
        System.out.printf("Formatted with precision: PI=%.2f\n",Math.PI);

        float n=5.2f;

        //automatically appends zero to the rightmost part of the decimal
        System.out.printf("Formatted upto secific width:n= %.4f\n",n);

        n=12345678.3f;
        
        //number is formatted from right margin and occupies  a width of 20 characters
        System.out.printf("Formatted to right margin: n=%20.4f\n",n);
        
    }
}