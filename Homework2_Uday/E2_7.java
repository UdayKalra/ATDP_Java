
import java.lang.StringBuilder;
public class E2_7
{
    public static void main(String[] args){
        String food = "desserts";
        System.out.print("Original: ");
        System.out.println(food);
        food = new StringBuilder(food).reverse().toString();
        System.out.print("New: ");
        System.out.print(food);
    
    }
}
