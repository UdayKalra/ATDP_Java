
import java.awt.Rectangle;
public class E2_2
{
  public static void main(String[] args)
 {
    Rectangle box = new Rectangle(5,10,20,30);
    System.out.println(box);
    double height = box.getHeight();
    double width = box.getWidth();
    System.out.println("Expected: ");
    System.out.println(100.0);
    System.out.println("Actual: ");
    System.out.println(2*height+2*width);
    
    
   

    
    
 }
}
