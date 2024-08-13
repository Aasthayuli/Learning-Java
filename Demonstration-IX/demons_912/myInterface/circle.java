package myInterface;

public class circle implements geoAnalyzer{
    float radius;
    public circle(float r){
        radius=r;
    }
    public float area(){
        return (pi*radius*radius);
    }
    public float perimeter(){
        return (2*pi*radius);
    }
}