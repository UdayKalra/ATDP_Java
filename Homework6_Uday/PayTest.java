
/**
 * Tests the PayCheck class.
 * 
 * @author Uday
 * @version 1.0
 */
import java.util.Scanner;
public class PayTest
{
    public static void main(String[] args){
        try{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String n = in.next();
    System.out.println("Enter your daily salary: ");
    double s = in.nextDouble();
    System.out.println("Enter your work hours for a day: ");
    double h = in.nextDouble();
    System.out.println("Enter overtime hours if any: ");
    double ov = in.nextDouble();
    PayCheck you = new PayCheck(n,s,h,ov);
    System.out.print("Your hourly wage: $");
    System.out.printf("%2.2f", you.getWage());
}catch(Exception ex){
System.out.println("Invalid Input. Goodbye!");
}
}
}
