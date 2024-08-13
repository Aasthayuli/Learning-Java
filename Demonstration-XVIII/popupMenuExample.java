import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class popupMenuExample {
    popupMenuExample() {
        JFrame f = new JFrame("PopUp Menu Example");
        JPopupMenu popupmenu = new JPopupMenu();
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        f.setBackground(Color.cyan);
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        f.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                if (evt.getButton() == MouseEvent.BUTTON3) { // Left mouse button
                    popupmenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
        });
        // f.add(popupmenu);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new popupMenuExample();
    }
}