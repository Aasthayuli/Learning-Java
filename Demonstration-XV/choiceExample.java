import java.awt.*;

public class choiceExample {
    choiceExample() {
        Frame f = new Frame("Choice Example");
        Choice c = new Choice();
        c.setBounds(100, 100, 75, 75);
        String arr[] = { "C++", "Java", "Python", "C", "C#" };
        for (String item : arr) {
            c.add(item);
        }
        f.add(c);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new choiceExample();
    }
    
}