import java.awt.*;
import java.awt.event.*;

public class awtcontrol {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    public awtcontrol() {
        prepareGUI();
    }

    public static void main(String[] args) {
        awtcontrol Awtcontrol = new awtcontrol();
        Awtcontrol.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));// Sets the layout manager of the mainFrame to a GridLayout with 3rows
                                                  // and 1
        // column.
        // The GridLayout manager arranges components in a grid, with components being
        // laced in the grid cells in the order they are added.

        mainFrame.addWindowListener(new WindowAdapter() {
            // Add a WindowListener to the mainFrame. The WindowListener interface provides
            // two methods:
            // windowOpened(WindowEvent e) and windowClosing(WindowEvent e).
            //
            // The windowClosing(WindowEvent e) method is called when the user attempts to
            // close the window.
            // By default, the close operation is simply hide the window. However, we want
            // to exit the application
            // when the window is closed, so we override the windowClosing(WindowEvent e)
            // method to call System.exit(0).

            // WindowAdapter is a convenience class that provides empty implementations of
            // the WindowListener interface's methods.
            // It is used to simplify the task of implementing a listener for window events.
            // all System.exit(0) to terminate the Java Virtual Machine and exit the
            // application.
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setBackground(Color.BLUE);
        headerLabel.setForeground(Color.WHITE);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
        statusLabel.setBackground(Color.BLUE);
        statusLabel.setForeground(Color.WHITE);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        controlPanel.setBackground(Color.LIGHT_GRAY);
    }

    private void showEventDemo() {
        headerLabel.setText("Control in Action: Button");
        Button okButton = new Button("OK");
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");

        // "ActionCommand" is a String property of ActionListener-enabled components, such as buttons, that specifies the action command to be sent to listeners when the component is activated.
        // In this case, we are setting the action command for the "okButton" to "OK". This "action command" can be used later by an ActionListener to determine which button was clicked.

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        // "addActionListener" is a method of the Button class that associates an ActionListener object with the Button. When the button is activated, the ActionListener's actionPerformed method will be called.
        // In this case, we are associating a new instance of the ButtonClickListener class with the Button. This ActionListener will be called when the Button is clicked.
        // The ButtonClickListener class is defined below the showEventDemo method.
        
        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("OK")) {
                statusLabel.setText("OK Button clicked");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked");
            } else {
                statusLabel.setText("Cancel Button clicked");
            }
        }
    }
}