/*Inheritance example : initialising through constructor */

class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

// Here, Box is intended to include weight
class BoxWeight extends Box {
    double weight;

    // constructor for boxweight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class demons_62a {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: " + vol);
        System.out.println("weight of mybox2 is: " + mybox2.weight);
        System.out.println();

    }
}