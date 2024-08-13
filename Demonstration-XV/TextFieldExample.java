import java.awt.*;

class TextFieldExample {
    public static void main(String[] args) {
        Frame f = new Frame("TextField Example");
        TextField t1 = new TextField("Welcome to Java");
        t1.setBounds(50, 100, 150, 20);
        f.add(t1);
        TextField t2 = new TextField("Welcome to World");
        t2.setBounds(50, 200, 150, 20);
        f.add(t2);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}