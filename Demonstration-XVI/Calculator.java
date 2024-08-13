
//Java Program to create a simple Calculator
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    static JFrame f;
    static JTextField t;
    String s0, s1, s2;

    Calculator() {
        s0 = s1 = s2 = "";
    }

    public static void main(String[] args) {
        f = new JFrame("Swing Calculator");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // Create a n object of class
        Calculator c = new Calculator();
        // create a textfield
        t = new JTextField(100);
        t.setHorizontalAlignment(JTextField.CENTER);
        t.setPreferredSize(new Dimension(500, 50));
        t.setBackground(Color.white);
        // Create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq;
        // create number buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        // create operators
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        be = new JButton("=");
        beq = new JButton("C");
        // create a panel
        JPanel p = new JPanel();
        // add ActionListener
        bm.addActionListener(c);
        bd.addActionListener(c);
        bs.addActionListener(c);
        ba.addActionListener(c);
        b0.addActionListener(c);
        b1.addActionListener(c);
        b2.addActionListener(c);
        b3.addActionListener(c);
        b4.addActionListener(c);
        b5.addActionListener(c);
        b6.addActionListener(c);
        b7.addActionListener(c);
        b8.addActionListener(c);
        b9.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);

        // add elements to panel
        p.add(ba);
        p.add(bs);
        p.add(bm);
        p.add(bd);
        p.add(b9);
        p.add(b8);
        p.add(b7);
        p.add(b6);
        p.add(b5);
        p.add(b4);
        p.add(b3);
        p.add(b2);
        p.add(b1);
        p.add(b0);
        p.add(beq);
        p.add(be);

        p.setLayout(new GridLayout(5, 4, 10, 10));
        // set background color of panel
        p.setBackground(Color.BLUE);

        // add panel to frame
        f.add(t, BorderLayout.NORTH);
        f.add(p, BorderLayout.CENTER);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        // if the value is a number
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(0) == '.') {
            // if operand is present then add to second number
            if (!s1.equals("")) {
                s2 = s2 + s;
            } else {
                s0 = s0 + s;
                // set the value of text
                t.setText(s0 + s1 + s2);
            }
        } else if (s.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";
            // set the value of text
            t.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '=') {
            double te;
            // store the value in 1st
            if (s1.equals("+")) {
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            } else if (s1.equals("-")) {
                te = Double.parseDouble(s0) - Double.parseDouble(s2);
            } else if (s.equals("/")) {
                if (Double.parseDouble(s2) == 0) {
                    // handle division by zero
                    t.setText("Error: Division by zero");
                    return;
                } else {
                    te = Double.parseDouble(s0) / Double.parseDouble(s2);
                }
            } else {
                te = Double.parseDouble(s0) * Double.parseDouble(s2);
            }
            // set the value of text
            t.setText(s0 + s1 + s2 + "= " + te);
            // convert to string
            s0 = Double.toString(te);
            // place the operator
            s1 = s2 = "";
            // make the operand blank
        } else {
            // if there was no operand
            if (s1.equals("") || s2.equals("")) {
                s1 = s;
            } else {
                double te;
                // store the value in 1st
                if (s1.equals("+")) {
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                } else if (s1.equals("-")) {
                    te = Double.parseDouble(s0) - Double.parseDouble(s2);
                } else if (s.equals("/")) {
                    if (Double.parseDouble(s2) == 0) {
                        // handle division by zero
                        t.setText("Error: Division by zero");
                        return;
                    } else {
                        te = Double.parseDouble(s0) / Double.parseDouble(s2);
                    }
                } else {
                    te = Double.parseDouble(s0) * Double.parseDouble(s2);
                }
                // convert it to string
                s0 = Double.toString(te);
                // palce the operator
                s1 = s;
                // make the operand blank
                s2 = "";
            }
            // set the value of text
            t.setText(s0 + s1 + s2);
        }
    }
}
