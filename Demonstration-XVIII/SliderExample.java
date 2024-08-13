import javax.swing.*;

public class SliderExample extends JFrame {
    public SliderExample() {
        // JSlider slider = new JSlider();
        // slider.setMinorTickSpacing(10);
        // slider.setMajorTickSpacing(50);
        // slider.setPaintTicks(true);
        // slider.setPaintLabels(true);
        // add(slider);
        // setSize(400, 400);
        // setVisible(true);
        // setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        SliderExample frame = new SliderExample();
        frame.setTitle("Slider Example");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}