import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class demons_21 extends Applet{

    public void init(){
        resize(800,800);
        //To resize the applet from the default size mentioned in html file.

        setBackground(Color.GREEN); //In init() method, we can set background colour too.
    }
    public void paint(Graphics g){
        g.drawString("Welcome",100,100);
        g.drawString("Welcome to coding world!",10,10);
        //location of the string is mentioned (100 X 100)
    }
}