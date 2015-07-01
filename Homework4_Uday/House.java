
/**
 * Draws a house.
 * 
 * @author Uday Kalra 
 * @version 1.0
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

public class House
{
    // instance variables - replace the example below with your own
    public double x;
    public double y;
    public double width;
    public double height;

    /**
     * Creates a house with a top left corner and dimensions.
     * @param flat x-coord of house corner.
     * @param lon y-coord of house corner.
     * @param wide Width of house.
     * @param high Height of house.
     */
    public House(double flat, double lon, double wide, double high)
    {
        // initialise instance variables
        x = flat;
        y = lon;
        width = wide;
        height = high;
    }

    /**
     * Draws the created house.
     * 
     * @param  g Graphics2D
     * 
     */
    public void draw(Graphics2D g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(new Color(139,69,19));
    g2.fill(new Rectangle.Double(x,y,width,height));
    g2.draw(new Rectangle.Double(x,y,width,height));
    g2.setColor(new Color(255,255,255));
    g2.fill(new Rectangle.Double(x+0.4*width,y+0.6*height,0.3*width,0.4*height));
    g2.setColor(new Color(153,255,255));  
    g2.fill(new Rectangle.Double(x+0.4*width,y+0.2*height,0.3*width,0.2*height));
      
      
      
    }
}
