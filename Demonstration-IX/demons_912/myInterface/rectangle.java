package myInterface;

public class rectangle implements geoAnalyzer
{
    float length, width;
    public rectangle(float l,float w)
    {
        length=l;
        width=w;
    }
    public float area()
    {
        return (length*width);
    }
    public float perimeter()
    {
        return (2*(length*width));
    }
}