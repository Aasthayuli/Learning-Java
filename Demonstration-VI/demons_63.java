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

class demons_63 {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;
        vol = weightBox.volume();
        System.out.println("volume of weightbox is: " + vol);
        System.out.println("weight of weightbox is: " + weightBox.weight);
        // Assigning boxWeight(subclass) refernce to Box(superclass) reference
        plainBox = weightBox;
        vol = plainBox.volume(); // ok, volume is defined in box
        System.out.println("volume of plainbox is: " + vol);

        /* The following statement is invalid because plainBox doesnot define a weight member.*/
        // System.out.println("weight of plainbox is: "+weightBox.weight);
    }
}