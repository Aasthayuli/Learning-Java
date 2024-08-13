import javax.swing.*;
//Inheriting JFrame
public class simple2 extends JFrame {

    JFrame f;

    simple2() {
        // f = new JFrame();//No need to create explicitly
        JButton b = new JButton("click me");
        b.setBounds(100, 100, 100, 40);
        add(b); // No need to use dot operator(.) to call these functions for frame
        setLayout(null); // No need to use dot operator(.) to call these functions for frame
        setSize(400, 400); // No need to use dot operator(.) to call these functions for frame
        setVisible(true); // No need to use dot operator(.) to call these functions for frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // No need to use dot operator(.) to call these functions for
                                                        // frame
    }

    public static void main(String[] args) {
        new simple2();
    }
}