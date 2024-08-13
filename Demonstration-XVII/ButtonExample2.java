import javax.swing.*;

public class ButtonExample2 {
    ButtonExample2() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon(
                "C:\\Users\\HP\\JAVA NPTEL REVISION\\Demonstration-XVII\\clickhere-removebg-preview.png"));
        b.setBounds(100, 100, 250, 250);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonExample2();
    }
}