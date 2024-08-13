import javax.swing.*;

public class CheckBoxExample {
    CheckBoxExample() {
        JFrame f = new JFrame("CheckBox Example");
        JCheckBox cb1 = new JCheckBox("C++");
        JCheckBox cb2 = new JCheckBox("Java", true);
        cb1.setBounds(100, 100, 100, 50);
        cb2.setBounds(100, 150, 100, 50);
        f.add(cb1);
        f.add(cb2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
