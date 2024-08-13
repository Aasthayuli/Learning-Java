package myInterface;

public class rectangle extends Geometry {
    protected float length, width;

    public rectangle() {
        length = 0.f;
        width = 0.f;
    }

    public rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    public float area() {
        return (length * width);
    }

    public float perimeter() {
        return (2 * (length * width));
    }
}