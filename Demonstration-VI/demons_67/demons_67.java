/*Example of multilevel inheritance  */


//Start with boxclass Box {
class Box {
    private double width;
    private double height;
    private double depth;
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
        super(w, h, d);      //call superclass constructor
        weight = m;
    }
}

//Add shipment cost
class shipment extends BoxWeight{
    double cost;
    shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost =c;
    }
}
class demons_67{
    public static void main(String[] args) {
        shipment s1=new shipment(10,20,15,10,3.41);
        shipment s2=new shipment(2,3,4,0.76,1.28);

        double vol;
        vol = s1.volume();
        System.out.println("Volume of shipment1 is: " + vol);
        System.out.println("Weight of shipment1 is: " + s1.weight);
        System.out.println("Shipping cost :$ " + s1.cost);
        System.out.println("");
        vol=s2.volume();
        System.out.println("Volume of shipment2 is: " + vol);
        System.out.println("Weight of shipment2 is: " + s2.weight);
        System.out.println("Shipping cost :$ " + s2.cost);
    }
}