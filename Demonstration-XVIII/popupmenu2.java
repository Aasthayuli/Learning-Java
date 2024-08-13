import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class popupmenu2 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new label
        JLabel label = new JLabel("Right Click any where to show the popup menu");
        // Create a new JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();

        // Create three JMenuItem
        JMenuItem option1 = new JMenuItem("What are u doin'");
        JMenuItem option2 = new JMenuItem("How are you?");
        JMenuItem exit = new JMenuItem("Don't wanna answer:(");

        // Add action listeners to the JMenuItem
        option1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 1 selected");
            }
        });

        option2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 2 selected");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add JMenuItem to JPopupMenu
        popupMenu.add(option1);
        popupMenu.add(option2);
        popupMenu.addSeparator();
        popupMenu.add(exit);

        // Add a mouse listener to the label to show the popup menu
        frame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) { // Right mouse button
                    // This line checks if the mouse button that was pressed was the left mouse
                    // button.
                    // The `evt.getButton()` method returns an integer representing the mouse button
                    // that was pressed.
                    // The `java.awt.event.MouseEvent.BUTTON1` constant represents the left mouse
                    // button.
                    // By checking if the button pressed was the left mouse button, we can ensure
                    // that the popup menu is only shown when the left mouse button is pressed.
                    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) { // Right mouse button
                    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
        });

        // Add the label to the JFrame
        frame.add(label);
        // Set the size of the JFrame
        frame.setSize(500, 500);

        // Center the JFrame on the screen
        frame.setLocationRelativeTo(null);

        // Make the JFrame visible
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
    }
}