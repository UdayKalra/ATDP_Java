import javax.swing.JFrame;
/**
 * Views drawn star.
 * @author Uday Kalra
 * @version 1.0
 */
public class ChartViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(500, 500);
      frame.setTitle("Chart");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ChartComponent component = new ChartComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
