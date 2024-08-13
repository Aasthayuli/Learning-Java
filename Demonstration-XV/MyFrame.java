import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame in Java");
        frame.resize(500, 500); // deprecated
        frame.setBackground(Color.BLUE);
        frame.show(); // deprecated
    }
}