import java.awt.*;

public class checkboxExample {
    checkboxExample() {
        Frame f = new Frame("Checkbox Example");
        Checkbox c1 = new Checkbox("C++");
        c1.setBounds(100, 100, 100, 100);
        Checkbox c2 = new Checkbox("Java");
        c2.setBounds(100, 200, 100, 100);
        Checkbox c3 = new Checkbox("Python");
        c3.setBounds(100, 300, 100, 100);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new checkboxExample();
    }
}