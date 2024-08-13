import java.util.Scanner;

class demons_46 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scnr.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle: " + area);
        double circumference = 2 * 3.14 * radius;
        System.out.println("circumference of the circle: " + circumference);
        scnr.close();
    }
}