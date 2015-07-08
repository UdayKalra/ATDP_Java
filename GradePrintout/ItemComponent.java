import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Scanner;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.*;
/**
   This component draws items.
*/
public class ItemComponent extends JComponent
{
    String name = null;
    
    public ItemComponent(String nm) {
        this.name = nm;
    }
    
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g; 
      //Picture
      g2.draw(new Rectangle(250,50,200,150));
      g2.setColor(new Color(153,204,255));
      g2.fill(new Rectangle(251,51,199,129));
      House house1 = new House(310,110,75,50);
      house1.draw(g2);
      g2.setColor(new Color(255,255,0));
      g2.fill(new Ellipse2D.Double(400,60,40,40));
      g2.setColor(new Color(102,51,0));
      g2.fill(new Rectangle(250,160,200,20));
      g2.setColor(new Color(102,51,0));
      PolyS aPolyS = new PolyS(305, 110, 0, 0);
      aPolyS.draw(g2);
      g2.setColor(new Color(0,0,0));
      g2.drawString("\"House\" by Uday Kalra",320,195);
      
      //Text
      g2.drawString("Course: SD 3535.2 – Programming in Java ",30,230);
      g2.drawString("Grade Report, 7/8/2015",30,250);
      g2.drawString("Student: "+name,30,270);
      //
      int grade = 75;
      String fullgr = null;
      String op= null;
      if(grade>=0&&grade<=59){
        fullgr = "F";
        }
        else if(grade>=60&&grade<=70){
        fullgr = "D";
        }
        else if(grade>=71&&grade<=79){
        fullgr = "C";
        }
        else if(grade>=80&&grade<=89){
        fullgr = "B";
        }
        else if(grade>=90&&grade<=100){
        fullgr = "A";
        }
        if (grade>=60&&grade<=62||grade>=71&&grade<=72||grade>=80&&grade<=82||grade>=90&&grade<=92){
        op = "-";
        }
        else if (grade>=67&&grade<=70||grade>=77&&grade<=79||grade>=87&&grade<=89||grade>=97&&grade<=100){
        op = "+";
        }
        else{
        op = "";
        }
        g2.drawString("Grade: "+op+fullgr+", %"+grade,30,290);
      g2.draw(new Rectangle(30,330,420,50));
      g2.draw(new Line2D.Double(320,330,320,380));
      g2.drawString("Parent Signature:",33,347);
      g2.drawString("Date:",323,347);
      
      
      
      
      //Logo
      g2.setColor(new Color(79,147,215));
      g2.setStroke(new BasicStroke(2));
      g2.fill(new Rectangle(90,84,6,42));
      g2.fill(new Rectangle(95,74,30,7));
      g2.fill(new Rectangle(106,60,6,66));
      g2.fill(new Rectangle(160,60,6,66));
      g2.fill(new Rectangle(175,84,6,66));
      g2.fill(new Ellipse2D.Double(54,84,42,42));
      g2.setColor(new Color(255,255,255));
      g2.fill(new Ellipse2D.Double(60,90,30,30));
      g2.setColor(new Color(79,147,215));
      g2.fill(new Ellipse2D.Double(124,84,42,42));
      g2.setColor(new Color(255,255,255));
      g2.fill(new Ellipse2D.Double(130,90,30,30));
      g2.setColor(new Color(79,147,215));
      g2.fill(new Ellipse2D.Double(174,84,42,42));
      g2.setColor(new Color(255,255,255));
      g2.fill(new Ellipse2D.Double(180,90,30,30));
      
      
   }
}
