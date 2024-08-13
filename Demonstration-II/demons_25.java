import java.applet.*;
import java.awt.*;

public class demons_25 extends Applet{

    public void paint(Graphics g){
        int x=0;
        int y=0;
        String msg=" ";

        x=Integer.parseInt(getParameter("xPosition"));
//getparameter() reads from the html file 
//the parameter inside this method is the string which should be mentioned in the html file from which the method reads.
        y=Integer.parseInt(getParameter("yPosition"));
        msg=getParameter("msg");

        g.drawString(msg,x,y);
    }
}