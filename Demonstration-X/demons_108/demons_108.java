class demons_108 {
    public static int j;

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            try {
                switch (i) {
                    case 0:
                        int zero = 0;
                        j = 999 / zero; // DivisionByZeroException
                        break;

                    case 1:
                        int b[] = null;
                        j = b[0]; // null pointer error
                        break;

                    case 2:
                        int c[] = new int[2];
                        j = c[10]; // ArrayIndexOutOfBoundsException
                        break;

                    case 3:
                        char ch = "java".charAt(9); // StringIndexOutOfBoundsException
                        break;
                }
            } catch (Exception e) {
                System.out.print("\nIn test case" + i + ": ");
                System.out.print(e.getMessage());
            }
        }
    }

}