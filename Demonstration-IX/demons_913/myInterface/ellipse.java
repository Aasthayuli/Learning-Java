package myInterface;

public class ellipse extends Geometry {
    protected float major, minor;

    public ellipse() {
        major = 0.f;
        minor = 0.f;
    }

    public ellipse(float m, float n) {
        this.major = m;
        this.minor = n;
    }

    public float area() {
        return (pi * major * minor);
    }

    public float perimeter() {
        return (pi * (major + minor));
    }

    public float getMinorAxis() {
        return minor;
    }

    public float getMajorAxis() {
        return major;
    }
}