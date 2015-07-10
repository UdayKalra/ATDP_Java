import java.util.Scanner;
/**
 * Finds the largest and smallest of inputs.
 * 
 * @author Uday
 * @version 1.0
 */
public class E6_2A
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter inputs: ");
        
        int big = in.nextInt();
        int small = big;
        int i = 0;
        while (i<2){
            int input = in.nextInt();
            big = Math.max(big, input);
            small = Math.min(small, input);
            i++;
        }
        System.out.println("Largest: "+big);
        System.out.println("Smallest: "+small);
        
    }
}
