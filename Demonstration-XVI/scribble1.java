import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * scribble1
 */
public class scribble1 extends Applet implements MouseMotionListener, MouseListener {
    private int last_x, last_y;

    public void init() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void mousePressed(MouseEvent e) {// MouseListener implementation
        last_x = e.getX();
        last_y = e.getY();
        showStatus("Mouse is Pressed!");
    }

    public void mouseDragged(MouseEvent e) {// MouseMotionListener implementation
        Graphics g = this.getGraphics();
        int x = e.getX();
        int y = e.getY();
        g.drawLine(last_x, last_y, x, y);
        last_x = x;// gives x-coordinate of the position of mouse
        last_y = y;// gives y-coordinate of the position of mouse
    }

    public void mouseMoved(MouseEvent e) { // MouseMotionListener implementation
        showStatus("Mouse is Moved!");
    }

    public void mouseClicked(MouseEvent e) {// MouseListener implementation
        showStatus("Mouse is Clicked!");
    }

    public void mouseEntered(MouseEvent e) {// MouseListener implementation
        showStatus("Mouse is Entering!");
    }

    public void mouseExited(MouseEvent e) {// MouseListener implementation
        showStatus("Mouse is Exiting!");
    }

    public void mouseReleased(MouseEvent e) {// MouseListener implementation
        showStatus("Mouse is Released!");
    }

}

/* <applet code ="scribble1.class" width=500 height=500></applet> */