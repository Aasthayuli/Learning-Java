/*Inheritance example :(using super keyword) initialising thorough constructor */

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
    BoxWeight() {
     super(); //call the default constructor of the super class
     weight=0.0;   
    }    
    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);  //call the overloaded constructor of the super class
        weight = m;
    }
}

class demons_62b {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: " + vol);
        // System.out.println("weight of mybox1 is: " + mybox1.weight);          //Error!

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: " + vol);
        System.out.println("weight of mybox2 is: " + mybox2.weight);
        System.out.println();

    }
}