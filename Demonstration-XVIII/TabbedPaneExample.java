import javax.swing.*;
import java.awt.*;
public class TabbedPaneExample {
    JFrame f;

    TabbedPaneExample() {
        f = new JFrame("Tabbed Pane Example");
        JTextArea t1 = new JTextArea("pane 1\nHey there! Are you also a programmer?", 10, 10);
        JTextArea t2 = new JTextArea("pane 2\nYou can Visit me on GitHub.");
        JTextArea t3 = new JTextArea("pane3\nYou can contact me on 9576****66");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.add(t1);
        p2.add(t2);
        p3.add(t3);
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(10, 10, 100, 100);
        tp.add("main", p1);
        tp.add("Visit", p2);
        tp.add("Help", p3);
        f.add(tp);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}