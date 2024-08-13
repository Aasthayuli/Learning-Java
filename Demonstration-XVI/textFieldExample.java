import java.awt.*;
import java.awt.event.*;

public class textFieldExample extends Frame implements ActionListener {
    TextField tf1, tf2, tf3;
    Button b1, b2, b3;

    textFieldExample() {
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2.setBounds(50, 100, 150, 20);
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);
        b1 = new Button("+");
        b2 = new Button("-");
        b1.setBounds(50, 200, 50, 50);
        b2.setBounds(120, 200, 50, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        // 'this' keyword is used here to refer to the current object of the class
        // 'textFieldExample' which is an instance of ActionListener interface.
        // It is used to register the current object as an ActionListener for the button
        // 'b1'.

        b3 = new Button("X");
        b3.setBounds(190, 200, 50, 50);
        b3.addActionListener(this);

        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        // String s3 = tf3.getText();
        if (s1.isEmpty() || s2.isEmpty()) {
            tf3.setText("Please enter numbers in both fields");
            return;
        }
        int a, b, c = 0;
        try {
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);

            if (e.getSource() == b1) {
                c = (a + b);
            } else if (e.getSource() == b2) {
                c = (a - b);
            } else if (e.getSource() == b3) {
                c = (a * b);
            }
            String result = String.valueOf(c);
            tf3.setText(result);

        } catch (NumberFormatException ex) {
            tf3.setText("Please enter numbers in both fields");
        }

    }

    public static void main(String[] args) {
        new textFieldExample();
    }
}