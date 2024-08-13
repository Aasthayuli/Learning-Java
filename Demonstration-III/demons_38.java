class Circle{
    double x,y;
    double r;

    double area(){
        return 3.14*r*r;
    }

    double circumference(){
        return 2*3.14*r;
    }

    Circle(double a,double b,double radius){
        x=a;y=b;r=radius;
    }

    Circle(){
        x=0;y=0;r=0;
    }

    Circle(Circle c){
        x=c.x;y=c.y;r=c.r;
    }

    Circle(double c){
        x=0.0;y=0.0;r=c;
    }
}

public class demons_38{
    public static void main(String[] args) {
        Circle c1=new Circle(2.0,3.0,4.0);
        Circle c2=new Circle(-4.0,-5.0,7.0);
        Circle c3=new Circle();
        Circle c4=new Circle(10.0);
        Circle c5=new Circle(c1);

        System.out.println("\nArea of circle c1: "+c1.area());
        System.out.println("\nArea of circle c2: "+c2.area());
        System.out.println("\nArea of circle c3: "+c3.area());
        System.out.println("\nArea of circle c4: "+c4.area());
        System.out.println("\nArea of circle c5: "+c5.area());
        
        System.out.println("\nCircumference of circle c1: "+c1.circumference());
        System.out.println("\nCircumference of circle c2: "+c2.circumference());
        System.out.println("\ncircumference of circle c3: "+c3.circumference());
        System.out.println("\ncircumference of circle c4: "+c4.circumference());
        System.out.println("\ncircumference of circle c5: "+c5.circumference());
        
    }
}