class my2darray{
    public static void main(String args[]){
        int my2darray[][]=new int[3][4];

        int i,j;

        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                my2darray[i][j] = (i*i+j*j);
            }
        }

        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.print(my2darray[i][j]+" ");
            }
            System.out.println();
        }



    }
}