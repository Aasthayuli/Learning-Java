import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame by Example");
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        frame.setLocationRelativeTo(null);
        // This line of code sets the location of the JFrame to the center of the
        // screen.
        // If the argument is null, the JFrame will be centered relative to the screen.
        // If the argument is not null, the JFrame will be centered relative to the
        // specified component.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // This line of code tells the JFrame to close the application when the user
        // click on the close button of the JFrame.
        // Without this line of code, the application would keep running in the
        // background.

    }
}