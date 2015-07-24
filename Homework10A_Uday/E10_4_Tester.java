import java.awt.Rectangle;

/**
   This program demonstrates the use of a Measurer.
*/
public class E10_4_Tester
{
   public static void main(String[] args)
   {
      Measurer areaMeas = new AreaMeasurer();
      Rectangle rect1;
      Rectangle rect2;
      Rectangle rect3;
      Rectangle[] rects = new Rectangle[] 
         {
            rect1 = new Rectangle(5, 10, 20, 30),
            rect2 = new Rectangle(10, 20, 30, 40),
            rect3 = new Rectangle(20, 30, 5, 15)
         };

      Object largestArea = Data2.max(rects, areaMeas);//Calling max
      double x = areaMeas.measure(largestArea);
      System.out.println("\nE10.4");
      System.out.println("\nLargest area: " + x);
      System.out.println("Expected: 1200");
   }
}
