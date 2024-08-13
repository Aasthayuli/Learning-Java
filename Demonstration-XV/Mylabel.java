import java.awt.*;

public class Mylabel {
    public static void main(String[] args) {
        Frame f = new Frame("Label Example");
        Label l1 = new Label("First  Label");
        l1.setBounds(100, 100, 100, 30);
        l1.setBackground(Color.RED);
        f.add(l1);
        Label l2 = new Label("Second Label");
        l2.setBounds(100, 200, 100, 30);
        l2.setBackground(Color.RED);
        f.add(l2);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}