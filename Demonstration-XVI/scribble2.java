/*<applet code ="scribble2.class" width=500 height=500></applet> */

import java.awt.*;
// import java.awt.event.*;
import java.applet.*;

public class scribble2 extends Applet {
    private int last_x, last_y;// stores the last mouse position
    private Color current_color = Color.black;// stores the current color
    private Button clear_button;// clear button
    private Choice color_choices;// The color dropdown list

    public void init() {
        this.setBackground(Color.white);

        // Adding clear button
        clear_button = new Button("Clear");
        clear_button.setForeground(Color.black);
        clear_button.setBackground(Color.lightGray);
        this.add(clear_button);

        // adding colour choice menu
        color_choices = new Choice();
        color_choices.addItem("Black");
        color_choices.addItem("Red");
        color_choices.addItem("Green");
        color_choices.addItem("Blue");
        color_choices.addItem("Yellow");
        color_choices.addItem("Cyan");
        color_choices.addItem("Magenta");
        color_choices.setForeground(Color.black);
        color_choices.setBackground(Color.lightGray);
        this.add(new Label("Color:"));
        this.add(color_choices);
    }

    // start the scribble
    public boolean mouseDown(Event e, int x, int y) {
        last_x = x;
        last_y = y;
        return true;
    }

    public boolean mouseDrag(Event e, int x, int y) {
        Graphics g = this.getGraphics();
        g.setColor(current_color);
        g.drawLine(last_x, last_y, x, y);
        last_x = x;
        last_y = y;
        return true;
    }

    // This Method is called when the user clicks the button or chooses a color
    public boolean action(Event event, Object args) {
        // If the clear button was clicked
        if (event.target == clear_button) {
            Graphics g = this.getGraphics();
            Rectangle r = this.getBounds();
            g.setColor(Color.white);
            g.fillRect(r.x, r.y, r.width, r.height);
            return true;
        } else if (event.target == color_choices) {
            if (args.equals("Black")) {
                current_color = Color.black;
            } else if (args.equals("Red")) {
                current_color = Color.red;
            } else if (args.equals("Green")) {
                current_color = Color.green;
            } else if (args.equals("Blue")) {
                current_color = Color.blue;
            } else if (args.equals("Yellow")) {
                current_color = Color.yellow;
            } else if (args.equals("Cyan")) {
                current_color = Color.cyan;
            } else if (args.equals("Magenta")) {
                current_color = Color.magenta;
            }

            return true;
        } else {
            // Otherwise let the superclass handle it
            return super.action(event, args);
        }
    }
}