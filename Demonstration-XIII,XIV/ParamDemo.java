import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet {
    String fontName;
    int fontSize;
    float Leading;
    boolean active;

    // Inistialize the string to be displayed
    public void start() {
        String param;
        fontName = getParameter(fontName);
        if (fontName == null) {
            fontName = "Not Found!";
        }
        param = getParameter("fontSize");
        try {
            if (param != null) {
                fontSize = Integer.parseInt(param);
            } else {
                fontSize = 0;
            }
        } catch (NumberFormatException e) {
            fontSize = -1;
        }
        param = getParameter("Leading");
        try {
            if (param != null) {
                Leading = Float.valueOf(param).floatValue();
            } else {
                Leading = 0;
            }
        } catch (NumberFormatException e) {
            Leading = -1;
        }

        param = getParameter("accountEnabled");
        if (param != null) {
            active = Boolean.valueOf(param).booleanValue();
        }
        // else{
        // active=false;
        // }
    }

    // Display parameters
    public void paint(Graphics g) {
        g.drawString("Font Name : " + fontName, 10, 50);
        g.drawString("Font Size: " + fontSize, 25, 70);
        g.drawString("Leading: " + Leading, 40, 90);
        g.drawString("Active: " + active, 60, 110);
    }
}