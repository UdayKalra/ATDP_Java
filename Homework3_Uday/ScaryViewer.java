import javax.swing.JFrame;

public class ScaryViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Scary Face");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ScaryComponent component = new ScaryComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
