//Following Program demonstrates the use of stop() method
//stop() method doesn't remove it permanently from the memory

//Create a child frame window from within an applet
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//Create a subclass of frame
class SampleFrame extends Frame {
    SampleFrame(String title) {
        super(title);
        // Create an object to handle window events
        MyWindowAdapter adapter = new MyWindowAdapter(this);

        // register it to receive those events
        addWindowListener(adapter);
    }

    public void paint(Graphics g) {
        g.drawString("This is a Frame window", 50, 70);
    }
}

// Event handler class
class MyWindowAdapter extends WindowAdapter {
    SampleFrame sampleframe;

    public MyWindowAdapter(SampleFrame SampleFrame) {
        this.sampleframe = sampleframe;// not being used. Therefore, has no effect
    }

    public void windowClosing(WindowEvent e) {
        sampleframe.setVisible(false);
    }
}

// Create a Frame Window
public class AppletFrame extends Applet {
    Frame f;

    public void init() {
        f = new SampleFrame("A Frame Window");
        f.setSize(250, 250);
        // f.setVisible(true);
    }

    public void start() {
        f.setVisible(true);
    }

    public void stop() {
        f.setVisible(false);
    }

    public void paint(Graphics g) {
        g.drawString("This is an Applet Window", 10, 20);
    }
}

/* <applet code="AppletFrame.class" width=500 height=500></applet> */