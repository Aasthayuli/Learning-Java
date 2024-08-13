import myInterface.*;

//A class that implements interface

class demons_91 implements aninterface {
    public void display() { // Implementing the abstract method
        System.out.println("Fine!");
    }

    public static void main(String[] args) {
        demons_91 t = new demons_91();
        t.display();
        System.out.println("The final value of a in myInterface: " + a);
    }
}
