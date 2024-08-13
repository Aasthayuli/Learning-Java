class student{
    int Roll_no;
    String Name,Course;
    float Fees;

    student(int roll, String name, String course){
        this.Roll_no=roll;
        this.Name=name;
        this.Course=course;
    }

    student(int roll, String name, String course, float fee){
        this(roll, name, course);
        this.Fees=fee;
    }

    void display(){
        System.out.println("Roll No. : "+Roll_no+" Name: "+Name+" Course: "+Course+" Fees: "+Fees);
    }
}

class demons_310{
    public static void main(String[] args){
        student s1=new student(221164,"Aasthayuli","Java");
        student s2=new student(221177,"Riya Rajput","Java",70000);
        s1.display();
        s2.display();
    }
}