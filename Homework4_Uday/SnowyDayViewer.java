import javax.swing.JFrame;
/**
 * Views drawn star.
 * @author Uday Kalra
 * @version 1.0
 */
public class SnowyDayViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(1800, 1000);
      frame.setTitle("Snowy Day");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      SnowyDayComponent component = new SnowyDayComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
