import javax.swing.JFrame;

public class WindowsViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Windows Logo");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      WindowsComponent component = new WindowsComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
