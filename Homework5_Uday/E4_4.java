
/**
 * Prints multiple computations of two integers.
 * 
 * @author Uday 
 * @version 1.0
 */
import java.util.Scanner;
public class E4_4
{
    public static void main(String[] args){
    int x;
    int y;
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter your first integer: ");
    x = in.nextInt();
    System.out.println("Please enter your second integer: ");
    y = in.nextInt();
    System.out.println("Sum: " + (x+y));
    System.out.println("Difference: " + (x-y));
    System.out.println("Product: " + (x*y));
    System.out.println("Average: " + (x+y)/2);
    System.out.println("Distance: " + (Math.abs(x-y)));
    System.out.println("Maximum: " + (Math.max(x,y)));
    System.out.println("Minimum: " + (Math.min(x,y)));
    
    }
}
