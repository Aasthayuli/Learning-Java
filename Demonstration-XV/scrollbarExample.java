import java.awt.*;

public class scrollbarExample {

    scrollbarExample() {

        Frame f = new Frame("Scrollbar Example");
        Scrollbar h = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 100);
        h.setBounds(100, 50, 300, 50);
        f.add(h);
        Scrollbar v = new Scrollbar(Scrollbar.VERTICAL, 0, 20, 0, 100);
        v.setBounds(100, 200, 50, 300);
        f.add(v);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new scrollbarExample();
    }
}