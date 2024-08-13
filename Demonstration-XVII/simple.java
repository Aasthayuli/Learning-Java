import javax.swing.*;

public class simple {

    JFrame f;

    simple() {
        f = new JFrame();
        JButton b = new JButton("click me");
        b.setBounds(100, 100, 100, 40);
        f.add(b);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new simple();
    }
}