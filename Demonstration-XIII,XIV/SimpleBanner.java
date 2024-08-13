//A Simple Banner Applet
//This applet creates a thread that scrolls the message contained in msg right to left across the applet's window

import java.awt.*;
import java.applet.*;

public class SimpleBanner extends Applet implements Runnable {

    String msg = " A Simple Moving Banner";
    Thread t = null;
    int state;
    boolean stopFlag;

    // set colours and initialize thread
    public void init() {
        setBackground(Color.blue);
        setForeground(Color.white);
    }

    // Start Thread
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    // Entry point for the thread that runs the banner
    public void run() {
        char ch;
        // Display banner
        for (;;) {
            try {
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;
                if (stopFlag)
                    break;
            } catch (InterruptedException e) {
            }
        }
    }

    public void stop() {
        stopFlag = true;
        t = null;
        System.out.println("Stopped the applet");
    }

    // Display the banner
    public void paint(Graphics g) {
        g.drawString(msg, 50, 30);
    }

}