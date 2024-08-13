import java.awt.*;
import java.applet.*;

public class AppletSkeleton extends Applet {

    /*
     * 
     * 
     *  * These methods are abstract methods and are defined in Applet
     * 
     
     * class(java.applet package).
     * These methods are optional and preferably to be overwritten as per the need
     * of your applet.
     */
    public void init() {
    }

    public void start() {
    }

    public void stop() {
    }

    public void destroy() {
    }

    public void paint(Graphics g) {
    }
}

/* <applet code="AppletSkeleton.class" width=500 height=500></applet> */

// Run the applet:-
// javac AppletSkeleton.java
// appletviewer AppletSkeleton.java