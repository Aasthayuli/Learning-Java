package myInterface;

public class ellipse implements geoAnalyzer{
    float major;
    float minor;

    public ellipse(float m, float n){
        major=m;
        minor=n;
    }

    public float area(){
        return (pi*major*minor);
    }

    public float perimeter(){
        return (pi*(major+minor));
    }
}