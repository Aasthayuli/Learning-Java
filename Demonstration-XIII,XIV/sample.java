import java.awt.*;
import java.applet.*;

public class sample extends Applet {
    String msg;

    public void init() {
        // set the foreground and background color
        setBackground(Color.blue);
        setForeground(Color.white);
        msg += "Inside init()--";
    }

    // Initialize the string to be displayed
    public void start() {
        msg += "iside start() --";
    }

    // Display msg in applet window
    public void paint(Graphics g) {
        g.drawString(msg, 10, 30);
    }
}