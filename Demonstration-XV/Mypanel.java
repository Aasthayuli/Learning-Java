import java.awt.*;

public class Mypanel {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame with Panel");
        Panel panel = new Panel();
        frame.resize(500, 500); // deprcated
        frame.setBackground(Color.BLUE);
        frame.setLayout(null);
        panel.resize(100, 100); // deprcated
        panel.setBackground(Color.YELLOW);
        frame.add(panel);
        frame.show(); // deprcated
    }
}