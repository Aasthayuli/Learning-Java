import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Keycodes.class" width=500 height=500></applet> */

public class Keycodes extends Applet implements KeyListener {
    String msg = "";
    int X = 10, Y = 20;

    public void init() {
        addKeyListener(this);// register KeyListener
        requestFocus();// awt instructs runtime manager to request focus for the Keyboard
    }

    public void keyPressed(KeyEvent e) {
        showStatus("Key Down");
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_F1:
                msg += "<F1>";
                break;
            case KeyEvent.VK_F2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_F4:
                msg += "<F4>";
                break;
            case KeyEvent.VK_F5:
                msg += "<F5>";
                break;
            case KeyEvent.VK_F6:
                msg += "<F6>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<Right Arrow>";
                break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        showStatus("Key up");
    }

    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }
}