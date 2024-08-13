/*polymorphism by means of interface */

import myInterface.*;

class demons_912 {
    static void display(float x, float y) {
        /*
         * shows binded polymorphism.
         * display() method can display area, perimeter for the different objects as per
         * the refernces there.
         */
        System.out.println("Area " + x + "\nPerimeter= " + y);
    }

    public static void main(String[] args) {
        circle c = new circle(5.2f);
        ellipse e = new ellipse(4.5f, 3.6f);
        rectangle r = new rectangle(6.5f, 4.3f);

        // display(c.area(), c.perimeter());
        // display(e.area(), e.perimeter());
        // display(r.area(), r.perimeter());

        // OR
        geoAnalyzer geoItem;
        geoItem = c; // assinging reference of object of class circle
        display(geoItem.area(), geoItem.perimeter());
        geoItem = e;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = r;
        display(geoItem.area(), geoItem.perimeter());
    }
}