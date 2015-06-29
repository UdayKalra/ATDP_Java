
import java.awt.Rectangle;
public class P2_1
{
    public static void main(String[] args){
        Rectangle first = new Rectangle(5,10,20,30);
        System.out.println(first);
        first.translate(20,0);
        System.out.println(first);
        first.translate(0,-30);
        System.out.println(first);
        first.translate(-20,0);
        System.out.println(first);
    
    
    }
}
