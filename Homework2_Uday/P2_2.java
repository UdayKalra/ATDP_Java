import java.awt.Rectangle;
public class P2_2
{
    public static void main(String[] args){
        Rectangle squ = new Rectangle(100,100,50,50);
        System.out.println("Old: "+squ);
        squ.grow(25,25); 
        squ.translate(25,25); 
        System.out.println("New: "+squ);
        
    
    
    
    }
}
                                           