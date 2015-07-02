import java.util.Scanner;
/**
 * Calculate the BMI of the user.
 * 
 * @author Uday
 * @version 1.0
 */
public class BMICalculator
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please state your name: ");
        String nam = in.next();
        System.out.println("Please state your age: ");
        int ag = in.nextInt();
        System.out.println("Please state your weight in lbs: ");
        double wt = in.nextDouble();
        System.out.println("Please state your height in in.: ");
        double ht = in.nextDouble();
        double bmi = wt/Math.pow(ht, 2);
        System.out.println("BMI for "+nam+", age "+ag+", is "+bmi);
        
    }
}
