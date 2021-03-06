import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;

/*
   A component that draws two rectangles.
*/
public class ScaryComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      Color blu = new Color(0,0,255);
      double result = Math.random() * (175 - 100.00) + 100.00;
    
      Ellipse2D.Double Face = new Ellipse2D.Double(100, result, 125, 150);
      Ellipse2D.Double eye1 = new Ellipse2D.Double(result, 150, 20, 20);
      Ellipse2D.Double eye2 = new Ellipse2D.Double(170 , result, 20, 20);
      Ellipse2D.Double pupil1 = new Ellipse2D.Double(result, 155, 10, 10);
      Ellipse2D.Double pupil2 = new Ellipse2D.Double(175, result, 10, 10);
      Line2D.Double nose1 = new Line2D.Double(155,result,145,195);
      Line2D.Double nose2 = new Line2D.Double(145,result,165,195);
      Line2D.Double nose3 = new Line2D.Double(155,result,165,195);
      Line2D.Double teeth1 = new Line2D.Double(result,200,140,220);
      Line2D.Double teeth2 = new Line2D.Double(140,result,155,200);
      Line2D.Double teeth3 = new Line2D.Double(result,200,170,220);
      Line2D.Double teeth4 = new Line2D.Double(170,result,180,200);
      Rectangle.Double mouth = new Rectangle.Double(result,190,50,20);
      g2.setColor(blu);
      g2.fill(Face);  
      g2.setColor(new Color(0,0,0));
      g2.setColor(new Color(255,255,255));
      g2.fill(eye1);
      g2.fill(eye2);
      g2.setColor(new Color(0,0,0));
      g2.fill(pupil1);
      g2.fill(pupil2);
      g2.setColor(new Color(0,255,0));
      g2.draw(nose1);
      g2.draw(nose2);
      g2.draw(nose3);
      g2.setColor(new Color(255,0,0));
      g2.fill(mouth);
      g2.setColor(new Color(0,0,0));
      g2.draw(teeth1);
      g2.draw(teeth2);
      g2.draw(teeth3);
      g2.draw(teeth4);
   }
}
