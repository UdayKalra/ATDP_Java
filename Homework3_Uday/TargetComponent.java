import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;

/*
   A component that draws two rectangles.
*/
public class TargetComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      Color redd = new Color(255,0,0);
      Ellipse2D.Double OutTar = new Ellipse2D.Double(100, 100, 100, 100);
      Ellipse2D.Double InTar = new Ellipse2D.Double(130, 130, 40, 40);
      g2.setColor(redd);
      g2.setStroke(new BasicStroke(20));
      g2.draw(OutTar);
      g2.setStroke(new BasicStroke(1));
      g2.fill(InTar);
   }
}
