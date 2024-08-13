import myInterface.*;

public class demons_913 {

    public static void main(String[] args) {

        // use the above class definition
        Geometry[] geoObjects = new Geometry[3];
        // create an array to hold geometry objects
        // referred in abstract class objects- geoObjects[i]
        geoObjects[0] = new circle(2.f);
        geoObjects[1] = new rectangle(1.f, 3.f);
        geoObjects[2] = new ellipse(4.f, 2.f);

        // OR, other to reference the objects in the array

        // circle c = new circle(2.f);
        // rectangle r = new rectangle(1.f, 3.f);
        // ellipse e = new ellipse(4.f, 2.f);
        // geoObjects[0] = c;
        // geoObjects[1] = r;
        // geoObjects[2] = e;

        float totalArea = 0;

        for (int i = 0; i < 3; i++) {
            totalArea = totalArea + geoObjects[i].area(); // runtime polymorphism
        }
        System.out.println("\ntotal Area of the geo objects is: " + totalArea + "\n");
    }
}

/*
 * difference between abstract class and interface:
 * in abstract class , there cannot be multiple inheritance
 * while in interface multiple inheritance is possible.
 */