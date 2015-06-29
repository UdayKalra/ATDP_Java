import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.net.MalformedURLException; 

public class E_Seventeen
{
    public static void main(String[] args){
        try {
            URL imageLocation = new URL(
            "http://images.clipartpanda.com/clipart-sun-LTKzKeGTa.png");
            JOptionPane.showMessageDialog(null, "Good Morning!", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }catch(MalformedURLException ex){
            ex.printStackTrace();
    
        }

    
    }
}

/*The program can throw an exception, so I just a put a try-catch to handle it. 
 * I just wanted to let you know why it was different from sample format. */