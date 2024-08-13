import java.awt.*;

public class checkboxgrpExample {
    checkboxgrpExample() {
        Frame f = new Frame("Checkbox Group Example");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("C++", cbg, false);
        c1.setBounds(100, 100, 100, 100);
        Checkbox c2 = new Checkbox("Java", cbg, true);
        c2.setBounds(100, 200, 100, 100);
        Checkbox c3 = new Checkbox("Python", cbg, false);
        c3.setBounds(100, 300, 100, 100);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new checkboxgrpExample();
    }
}