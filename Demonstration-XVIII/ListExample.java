import javax.swing.*;

public class ListExample {
    ListExample() {
        JFrame f = new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<String>();
        l1.addElement("Java");
        l1.addElement("C");
        l1.addElement("C++");
        l1.addElement("Python");
        JList<String> list = new JList<>(l1);
        list.setBounds(100, 100, 75, 75);
        f.add(list);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ListExample();
    }
}