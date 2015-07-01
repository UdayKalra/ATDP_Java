import javax.swing.JFrame;
/**
 * Views drawn star.
 * @author Uday Kalra
 * @version 1.0
 */
public class StarViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(500, 500);
      frame.setTitle("Stars");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      StarComponent component = new StarComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
