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
      Rectangle grenr = new Rectangle(150,150,50,50);
      Rectangle reddr = new Rectangle(100,150,50,50);
      Rectangle yellor = new Rectangle(150,200,50,50);     
      Rectangle blur = new Rectangle(100,200,50,50);    
      Line2D.Double firt = new Line2D.Double(150,155,150,245);
      Line2D.Double secnd = new Line2D.Double(105,200,195,200);
      g2.setColor(new Color(0,0,0));
      g2.fill(ring);
      g2.setColor(new Color(0,255,0));
      g2.fill(grenr);
      g2.setColor(new Color(255,0,0));
      g2.fill(reddr);
      g2.setColor(new Color(255,255,0));
      g2.fill(yellor);
      g2.setColor(new Color(0,128,255));
      g2.fill(blur);
      g2.setStroke(new BasicStroke(10));
      g2.setColor(new Color(255,255,255));
      g2.draw(firt);
      g2.draw(secnd);
      
   }
}
