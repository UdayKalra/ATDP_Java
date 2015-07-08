import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.Polygon;

/**
   A polygon (triangle).
*/
public class PolyS
{
   private int x;
   private int y;
   private int width;
   private int height;

   /**
      Constructs a Star at x, y coordinates of size w * h
      @param x the x-coordinate of the topleft corner
      @param y the y-coordinate of the topleft corner
      @param w the width
      @param h the height
   */
   public PolyS(int anX, int aY, int w, int h)
   {
      x = anX;
      y = aY;
      width = w; // currently not used in this class
      height = h; // currently not used in this class 
   }

   /**
      Draws a polgyon.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      // Polygon: Polygon(int[] xpoints, int[] ypoints, int npoints)
      int ptCount = 3;
      int [ ]  pointX = { x, 345, 390};
      int [ ]  pointY = { y, 90, 110};
      Polygon pShape = new Polygon(pointX, pointY, ptCount);
      g2.draw(pShape);
      g2.fill(pShape);      
    }
}

