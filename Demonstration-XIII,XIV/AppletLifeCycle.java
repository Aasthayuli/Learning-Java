//use of destroy() method in an applet program
//use to remove from the memory
//can be invoked only after stop() method is invoked

import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet {
    StringBuffer strbuf;

    public void init() {
        strbuf = new StringBuffer();
        addItem("Initializing the applet");
    }

    public void start() {
        addItem("Starting the Applet");
    }

    public void stop() {
        addItem("Stopped the applet");
    }

    public void destroy() {
        addItem("Unloaded the applet");
    }

    void addItem(String word) {
        System.out.println(word);
        strbuf.append(word);
        repaint();
    }

    public void paint(Graphics g) {
        // Draw a rectangle around the applet's display area
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

        // Display the String inside the Rectangle
        g.drawString(strbuf.toString(), 10, 20);
    }
}
/* <applet code="AppletLifeCycle.class" width=500 height=500></applet> */