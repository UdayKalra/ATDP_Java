import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.Color;

/*
   A component that draws two rectangles.
*/
public class OlympicComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      Color blu = new Color(0,0,255);
      Color yello = new Color(255,255,0);
      Color blac = new Color(0,0,0);
      Color gren = new Color(0,255,0);
      Color redd = new Color(255,0,0);
      Ellipse2D ring1 = new Ellipse2D.Double(90,120,100,100);
      Ellipse2D ring2 = new Ellipse2D.Double(150,175,100,100);
      Ellipse2D ring3 = new Ellipse2D.Double(210,120,100,100);
      Ellipse2D ring4 = new Ellipse2D.Double(270,175,100,100);
      Ellipse2D ring5 = new Ellipse2D.Double(330,120,100,100);
      g2.setStroke(new BasicStroke(10));
      g2.setColor(blu);
      g2.draw(ring1);
      g2.setColor(yello);
      g2.draw(ring2);
      g2.setColor(blac);
      g2.draw(ring3);
      g2.setColor(gren);      
      g2.draw(ring4);
      g2.setColor(redd);      
      g2.draw(ring5);
   }
}
