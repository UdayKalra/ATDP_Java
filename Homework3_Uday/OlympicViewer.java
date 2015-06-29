import javax.swing.JFrame;

public class OlympicViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(500, 400);
      frame.setTitle("Olympic Symbol");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OlympicComponent component = new OlympicComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}