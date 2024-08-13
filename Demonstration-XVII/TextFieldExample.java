import java.awt.event.*;
import javax.swing.*;

public class TextFieldExample implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    TextFieldExample() {
        JFrame f = new JFrame("TextField Example");
        tf1 = new JTextField();
        tf1.setBounds(50, 100, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 150, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 200, 150, 20);
        tf3.setEditable(false);
        b1 = new JButton("+");
        b1.setBounds(50, 250, 80, 30);
        b1.addActionListener(this);
        b2 = new JButton("-");
        b2.setBounds(50, 250, 80, 30);
        b2.addActionListener(this);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int i1, i2, i3 = 0;
        try {
            i1 = Integer.parseInt(s1);
            i2 = Integer.parseInt(s2);
            if (e.getSource() == b1) {
                i3 = i1 + i2;
                tf3.setText(Integer.toString(i3));
            } else if (e.getSource() == b2) {
                i3 = i1 - i2;
                tf3.setText(Integer.toString(i3));
            }
        } catch (NumberFormatException e1) {
        }

    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}
