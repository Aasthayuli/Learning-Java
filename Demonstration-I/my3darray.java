class my3darray {
    public static void main(String args[]) {
        int my3darray[][][] = new int[3][4][5]; // [pages][Rows][columns]

        int i, j, k;

        // Inserting elements into array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    my3darray[i][j][k] = i * j * k;
                }
            }
        }

        // Printing the 3d array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(my3darray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}