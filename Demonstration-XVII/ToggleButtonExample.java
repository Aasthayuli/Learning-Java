import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleButtonExample extends JFrame implements ItemListener {
    public static void main(String args[]) {
        new ToggleButtonExample();
    }

    private JToggleButton button;

    ToggleButtonExample(){
        setTitle("JToggleButton with ItemListener Example");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setJToggleButton() {
        button = new JToggleButton("JToggleButton");
        add(button);
    }

    private void setAction() {
        button.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent eve) {
        // this method is overriden in this class as to implement the ItemListener
        if (button.isSelected()) {
            button.setText("OFF");
        } else {
            button.setText("ON");
        }
    }
}