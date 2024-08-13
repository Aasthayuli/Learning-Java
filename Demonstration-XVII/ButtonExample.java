import java.awt.event.*;
import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame f=new JFrame("Button Example");
        final JTextField tf=new JTextField();
        tf.setBounds(50, 50,  150, 20);
        JButton b=new JButton("Click Me");
        b.setBounds(50, 100,  80,  30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Hello World");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
