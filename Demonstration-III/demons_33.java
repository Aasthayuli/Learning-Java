class circle{
    double x,y;
    double r;

    double area(){
        return 3.14*r*r;
    }

    double circumference(){
        return 2*3.14*r;
    }
}
class Box{
    double l,b,h;

    double area(){
        return 2*(l*b+b*h+l*h);
    }

    double volume(){
        return l*b*h;
    }

}

public class demons_33{
    public static void main(String[] args) {
        circle c1=new circle();
        circle c2=new circle();

        c1.x=2.0;c1.y=3.0;c1.r=5.0;
        c2.x=-2.0;c2.y=-4.0;c2.r=6.0;

        System.out.println("\nArea of circle c1: "+c1.area());
        System.out.println("\nArea of circle c2: "+c2.area());
        System.out.println("\nCircumference of circle c1: "+c1.circumference());
        System.out.println("\nCircumference of circle c2: "+c2.circumference()+"\n");

        Box b1=new Box();
        Box b2=new Box();

        b1.l=2.0;
        b1.b=4.0;
        b2.l=5.0;
        b2.b=3.0;

        System.out.println("\nArea of Box b1: "+b1.area());
        System.out.println("\nArea of Box b2: "+b2.area());
        System.out.println("\nVolume of Box b1: "+b1.volume());
        System.out.println("\nVolume of Box b2: "+b2.volume()+"\n");

    }
}