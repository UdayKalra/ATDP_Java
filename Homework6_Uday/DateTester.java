import java.util.Scanner;
/**
 * Tests the date class.
 * 
 * @author Uday
 * @version 1.0
 */
public class DateTester
{
    public static void main(String[] args){
        try{
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your month of birth: ");
        int x = in.nextInt();
        System.out.println("Please enter your day of birth: ");
        int y = in.nextInt();
        Date date1 = new Date(x, y);
        System.out.println(date1.getFortune());
    }catch(Exception ex){
    System.out.println("Invalid Argument! Goodbye!");
    }
    }
}
