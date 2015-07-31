 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
/**
 * Draws the map onto the window.
 * @version 1.0
 * @author Uday
 *
 */
class DrawMap extends JComponent implements MouseListener{
	public DrawMap(){
		this.addMouseListener(this);
		
	}
/**
 * Draws the image.
 * @param g Graphics2D
 * 
 */
public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Image map = new ImageIcon(getClass().getResource("/country.png")).getImage();
   
   //Image map = Toolkit.getDefaultToolkit().getImage("country.png");
    g2.drawImage(map, 0, 0, this);
    Line2D.Double can = new Line2D.Double(100,100,300,100);
    g2.setStroke(new BasicStroke(10));
   // g2.setColor(Color.BLUE);   debug
   // g2.draw(can);
}
/**
 * @param e Mouse Click
 * 
 */
public void mousePressed(MouseEvent e) {
   
    System.out.println(e.getX());
    System.out.println(e.getY());
 }

 public void mouseReleased(MouseEvent e) {
    
 }

 public void mouseEntered(MouseEvent e) {
   
 }

 public void mouseExited(MouseEvent e) {
    
 }

 public void mouseClicked(MouseEvent e) {
   
 }

}
