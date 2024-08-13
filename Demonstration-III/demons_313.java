class myclass {
    myclass() {
        this(5);
        // constructor call must be the first statement within a method or another
        // constructor & then followed by other statements.

        System.out.println("called another constructor using default constructor!");

    }

    myclass(int x) {
        System.out.println("calling constructor!");
    }
}

class demons_313 {
    public static void main(String args[]) {
        myclass obj = new myclass();
    }
}