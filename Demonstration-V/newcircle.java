public class newcircle {
    static int count = 0; // class variable
    public double x, y, r;

    public newcircle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        count++;
    }

    public newcircle() {
        this.x = 0;
        this.y = 0;
        this.r = 1.0;
        count++;
    }

    public newcircle(double r) {
        this(0.0, 0.0, r);
        count++;
    }

    public newcircle(newcircle c) {
        this(c.x, c.y, c.r);
        count++;
    }

    // An instance method(this can be stored only in circle type object)
    public newcircle bigger(newcircle c) {
        if (c.r > r) {
            return c;
        } else {
            return this;
        }
    }

    // A class method(this can be stored only in circle type object)
    public static newcircle bigger(newcircle a, newcircle b) {
        if (a.r > b.r) {
            return a;
        } else {
            return b;
        }
    }

    public double area() {
        return 3.14159 * r * r;
    }

    public double circumference() {
        return 2 * 3.14159 * r;
    }

    public static void main(String[] args) {
        newcircle c1 = new newcircle();
        System.out.println(c1.count); // can call the static variable and functions with the help of object created.

        newcircle c2 = new newcircle(1.0, 2.0, 4.0);
        System.out.println(c2.count);

        newcircle c3 = new newcircle(6.0);
        System.out.println(c3.count);

        System.out.println(count); // As well as without object (prefer this way, without object)
        System.out.println(c1.count + " " + c2.count + " " + c3.count);

        newcircle obj1 = c2.bigger(c3);
        newcircle obj2 = newcircle.bigger(c2, c3);
        System.out.println(obj1.r);
        System.out.println(obj2.r);

    }
}