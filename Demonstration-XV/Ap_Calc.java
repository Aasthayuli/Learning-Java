import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.TextField.*;

public class Ap_Calc extends Applet implements ActionListener {
    TextField one, two, res;
    Button add, sub, mul, div;

    public void init() {
        Label l1 = new Label("First Number: ", Label.RIGHT);
        Label l2 = new Label("Second Number: ", Label.RIGHT);
        Label l3 = new Label("Result: ", Label.RIGHT);

        one = new TextField(10);
        two = new TextField(10);
        res = new TextField(10);

        add = new Button("Add");
        sub = new Button("Sub");
        mul = new Button("Mul");
        div = new Button("Div");

        add(l1);
        add(one);
        add(l2);
        add(two);
        add(l3);
        add(res);

        add(add);
        add(sub);
        add(mul);
        add(div);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        float b1, b2, b3 = 0;
        String msg;
        b1 = Float.parseFloat(one.getText());
        b2 = Float.parseFloat(two.getText());

        if (str.equals("Add")) {
            b3 = b1 + b2;
        }

        if (str.equals("Sub")) {
            b3 = b1 - b2;
        }

        if (str.equals("Mul")) {
            b3 = b1 * b2;
        }

        if (str.equals("Div")) {
            b3 = b1 / b2;
        }

        msg = String.valueOf(b3);
        res.setText(msg);
        repaint();
    }

    public void paint(Graphics g) {

    }

}

/* <applet code="Ap_Calc.class" width="800" height="100"></applet> */