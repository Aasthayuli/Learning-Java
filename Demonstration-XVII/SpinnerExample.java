import javax.swing.*;

public class SpinnerExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Spinner Example");
        SpinnerModel value = new SpinnerNumberModel(5, // initial value
                0, // minimum value
                10, // maximum value
                1);// step
        JSpinner sp = new JSpinner(value);
        sp.setBounds(100, 100, 100, 50);
        f.add(sp);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}