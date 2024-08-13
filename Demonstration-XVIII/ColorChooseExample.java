import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ColorChooseExample extends JFrame implements ActionListener {
    JButton b;
    Container c;

    ColorChooseExample() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Color");
        b.addActionListener(this);
        c.add(b);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color initialColor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Choose a color", initialColor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        new ColorChooseExample();
    }
}