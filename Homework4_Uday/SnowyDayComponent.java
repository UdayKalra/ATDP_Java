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
public class SnowyDayComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   { 
       Graphics2D g2 = (Graphics2D) g;
       double result = Math.random() * (1800 - 0) + 0;
       double result2 = Math.random() * (700 - 0) + 0;
       g2.setColor(new  Color(152,255,255));
       g2.fill(new Rectangle(0,0,1800,1000));
       House one = new House(200.00,300.00,400.00,300.00);
       one.draw(g2);
      House two = new House(700.00,300.00,400.00,300.00);
       two.draw(g2);
       House tres = new House(1200.00,300.00,400.00,300.00);
       tres.draw(g2);
       g2.setColor(new Color(101,67,33));
       g2.fill(new Rectangle(0,600,1800,400));
       Star three = new Star(result,result2);
       result = Math.random() * (1800 - 0) + 0;
       result2 = Math.random() * (700 - 0) + 0;
       Star four = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star five = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star six = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star seven = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star eight = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star nine = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star ten = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star elev = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star twel = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star thirt = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star fourt = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star fift = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star sixt = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star eightt = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star ninet = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star twent = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700 - 0) + 0;
       Star tweno = new Star(result,result2);
        result = Math.random() * (1800 - 0) + 0;
        result2 = Math.random() * (700-0) + 0;
       Star twentw = new Star(result,result2);
      
       three.draw(g2);
       four.draw(g2);
       five.draw(g2);
       six.draw(g2);
       seven.draw(g2);
       eight.draw(g2);
       nine.draw(g2);
       ten.draw(g2);
       elev.draw(g2);
       twel.draw(g2);
       thirt.draw(g2);
       fourt.draw(g2);
       fift.draw(g2);
       sixt.draw(g2);
       eightt.draw(g2);
       ninet.draw(g2);
       twent.draw(g2);
       tweno.draw(g2);
       twentw.draw(g2);
       
       
       
    }
}
