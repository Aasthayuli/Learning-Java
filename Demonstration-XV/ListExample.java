import java.awt.*;

public class ListExample {
    ListExample() {
        Frame f = new Frame("List Example");
        List l1 = new List(5);
        l1.setBounds(100, 100, 75, 75);
        String arr[] = { "C++", "Java", "Python", "C", "C#" };
        for (String item : arr) {
            l1.add(item);
        }
        f.add(l1);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ListExample();
    }
}