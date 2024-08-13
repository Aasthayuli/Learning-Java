import javax.swing.*;

public class TableExample {
    JFrame f;

    TableExample() {

        f = new JFrame();
        String data[][] = { { "101", "Raj", "9876543210" }, { "102", "Vijay", "9876543210" },
                { "103", "Ravi", "9876543210" } };
        String column[] = { "ID", "Name", "Mobile" };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TableExample();
    }
}