import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("PasswordField Example");
        final JPasswordField pass = new JPasswordField();
        JLabel l1 = new JLabel("Username:");
        JLabel l2 = new JLabel("Password:");
        JButton b = new JButton("Login");
        JTextField t = new JTextField();
        final JLabel label = new JLabel("Enter Username and Password");
        /*
         * the label variable is declared as final, which means its reference cannot be
         * changed once it's initialized.
         * However, in the actionPerformed() method, you're not changing the reference
         * of the label variable;
         * you're changing the state of the object it refers to.
         * In Java, final only means the reference cannot be changed, not the object
         * itself.
         * Since JLabel is a mutable object, you can still call its methods to change
         * its state, such as setText().
         * 
         * final JLabel label = new JLabel("Initial text");
         * label.setText("New text");
         * // This is allowed because you're changing the state of the object
         * 
         * // This is not allowed because you're trying to change the reference
         * // label = new JLabel("New text"); // Compiler error
         * */
         

        
        label.setBounds(20, 150, 200, 50);
        l1.setBounds(20, 20, 80, 30);
        l2.setBounds(20, 75, 80, 30);
        b.setBounds(100, 120, 150, 30);
        pass.setBounds(100, 75, 100, 30);
        t.setBounds(100, 20, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username: " + t.getText();
                data += ", Password: " + new String(pass.getPassword());
                label.setText(data);
            }
        });
        f.add(pass);
        f.add(l1);
        f.add(label);
        f.add(l2);
        f.add(b);
        f.add(t);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
