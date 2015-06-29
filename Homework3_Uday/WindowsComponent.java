import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.*;

/*
   A component that draws two rectangles.
*/
public class WindowsComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Ellipse2D.Double ring = new Ellipse2D.Double(50,100,200,200);
      
      g2.setColor(new Color(0,0,255));
      g2.fill(ring);
   }
}
