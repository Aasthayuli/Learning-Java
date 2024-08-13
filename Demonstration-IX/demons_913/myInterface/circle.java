package myInterface;

// import myInterface.*;

public class circle extends Geometry {
    protected float radius;

    public circle() {
        radius = 1.f;
    }

    public circle(float r) {
        this.radius = r;
    }

    public float area() {
        return (pi * radius * radius);
    }

    public float perimeter() {
        return (2 * pi * radius);
    }

    public float getRadius() {
        return radius;
    }
}