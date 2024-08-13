import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code ="KeyeventsExample.class" width=500 height=500></applet> */
public class KeyeventsExample extends Applet implements KeyListener {
    String msg = "";
    int X = 10, Y = 20;// Output coordinates

    public void init() {
        addKeyListener(this);// register KeyListener
        requestFocus();// awt instructs runtime manager to request focus for the Keyboard
    }

    public void keyPressed(KeyEvent e) {
        showStatus("Key Down");
    }

    public void keyReleased(KeyEvent e) {
        showStatus("Key up");
    }

    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) { // Display keystrokes
        g.drawString(msg, X, Y);
    }
}