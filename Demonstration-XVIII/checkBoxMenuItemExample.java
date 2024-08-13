import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
// import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class checkBoxMenuItemExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("JMenu Example");
        JMenuBar menuBar = new JMenuBar();// It doesn't define any constructor to pass string as a parameter
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        // The selected line of code sets the mnemonic key for the "File" menu.
        // The mnemonic key is the shortcut key that the user can press to activate
        // the menu.
        // In this case, the mnemonic key is set to "F".
        // The user can press "Alt + F" to activate the "File" menu.
        menuBar.add(fileMenu);
        JMenuItem item1 = new JMenuItem("Open", KeyEvent.VK_N);
        JMenuItem item2 = new JMenuItem("Save", KeyEvent.VK_S);
        JMenuItem item3 = new JMenuItem("Save As", KeyEvent.VK_A);
        fileMenu.add(item1);
        fileMenu.add(item2);
        fileMenu.add(item3);
        JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Option_1");
        caseMenuItem.setMnemonic(KeyEvent.VK_C);
        fileMenu.add(caseMenuItem);

        ActionListener alistener = new ActionListener() {
            /**
             * Handle the action event when the checkbox menu item is selected.
             *
             * @param e the ActionEvent that triggered the action
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton abutton = (AbstractButton) e.getSource();
                // AbstractButton is an abstract class in Java that is the superclass for
                // JCheckBoxMenuItem, JRadioButtonMenuItem, and JMenuItem.
                // It provides a common base for these classes and allows them to share common
                // functionality.
                // AbstractButton is an abstract class because it does not provide a concrete
                // implementation of all the methods that it defines.
                // Instead, it provides a set of methods that can be overridden by subclasses to
                // provide their own implementation.
                // In this case, we are casting the source of the ActionEvent to an
                // AbstractButton because we know that it is one of these three types of menu
                // items.
                // By casting the source to an AbstractButton, we can then call methods that are
                // defined in the AbstractButton class on the source.
                boolean selected = abutton.getModel().isSelected();
                // The getModel() method is used to get the state of the checkbox menu item.
                // Returns the model that this button represents.
                // The isSelected() method is used to get the selected state of the checkbox
                // menu.
                // Indicates if the button has been selected. Only needed for certain types of
                // buttons - such as radio buttons and check boxes.

                String newLabel = selected ? "Value-1" : "Value-2";
                abutton.setText(newLabel);
            }
        };
        caseMenuItem.addActionListener(alistener);
        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
