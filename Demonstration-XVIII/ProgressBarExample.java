import javax.swing.*;

public class ProgressBarExample extends JFrame {
    JProgressBar jb;
    int i = 0;

    ProgressBarExample() {
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(300, 300);
        setLayout(null);
        setLocationRelativeTo(rootPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iterate() {
        while (i <= 2000) {
            jb.setValue(i);
            i = i + 20;
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        ProgressBarExample pb = new ProgressBarExample();
        pb.setVisible(true);
        pb.iterate();
    }
}