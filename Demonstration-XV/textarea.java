import java.awt.*;

public class textarea {
    textarea() {
        Frame f = new Frame("Text Area Example");
        TextArea area = new TextArea("Feedback:)");
        area.setBounds(50, 100, 300, 300);
        f.add(area);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new textarea();
    }
}