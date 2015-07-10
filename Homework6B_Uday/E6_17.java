import java.util.Scanner;
/**
 * Write a description of class E6_17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E6_17
{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        double rate = 0;
        double dollars = 0;
        
        System.out.println("Please enter the price for one U.S. Dollar in yen: ");
        rate = in.nextDouble();
        do{
            System.out.println("\nPlease enter the amount of U.S. Dollars to convert: ");
            dollars = in.nextDouble();
            System.out.print("Converted yen are: ");
            System.out.printf("%.2f", dollars*rate);
            
        }while(dollars != 0);
        System.out.print("\nGoodbye!");
    }
}
