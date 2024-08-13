import javax.swing.*;

public class ComboBoxExample {
    JFrame f;

    ComboBoxExample() {
        f = new JFrame("ComboBox Example");
        String Country[] = { "India", "Pakistan", "Nepal", "China", "USA" };
        JComboBox<String> cb = new JComboBox<>(Country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }

}