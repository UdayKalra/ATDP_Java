
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
import java.awt.*;
import java.util.ArrayList;
public class Chart
{
 ArrayList<Integer> lines = new ArrayList<Integer>(); 
    /**
     * Creates a Chart.
     * @param xLeft Left coordinate of star.
     * @param yTop Top coordinate of a star.
     */
public Chart(){
}
public void add(int n) {
    lines.add(n); 
}
/**
 * Draws the line with coordinates given.
 * @param g Graphics2D
 */
public void draw(Graphics2D g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(5));
    lines.add(60);
    lines.add(20);
    lines.add(30);
    lines.add(80);
    lines.add(60);
    
    int pos = 50;
     for(int i=0;i<lines.size();i++){
        g2.draw(new Line2D.Double(pos,400,pos,400-lines.get(i)));
        pos+=20;
        }
    }
}
