
/**
 * Creates a sketch of a star.
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
public class Star
{
     private int x;
    private int y;
    /**
     * Creates a "Star" sketch with top-left corner.
     * @param xLeft Left coordinate of star.
     * @param yTop Top coordinate of a star.
     */
public Star(int xLeft, int yTop){
x = xLeft;
y = yTop;

}
/**
 * Draws the star with coordinates given.
 * @param g Graphics2D
 */
public void draw(Graphics2D g){
    Graphics2D g2 = (Graphics2D) g;
      g2.setColor(new Color(0,0,255));
      g2.draw(new Line2D.Double(x,y,x+50,y+50));
      g2.draw(new Line2D.Double(x+50,y,x,y+50));    
      g2.draw(new Line2D.Double(x+25,y,x+25,y+50));
      g2.draw(new Line2D.Double(x+50,y+25,x,y+25));
    }
}
