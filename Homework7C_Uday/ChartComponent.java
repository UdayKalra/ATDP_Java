import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
/**
   A component that draws stars.
   @author Uday Kalra
   @version 1.0
*/
public class ChartComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   { 
       Graphics2D g2 = (Graphics2D) g;
       Chart one = new Chart();
       one.draw(g2);
    }
}
