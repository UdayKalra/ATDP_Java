import java.util.Scanner;
/**
 * Calculates the value of a coupon.
 * 
 * @author Uday
 * @version 1.0
 */
public class CouponCalculator
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the cost of your groceries: ");
        double cost = in.nextDouble();
        double coup=0;
        int perc=0;
        if (cost<10){
        coup=0.00*cost;
        perc=0;
        }
        else if(cost>=10&&cost<=60){
        coup=0.08*cost;
        perc=8;
        }
        else if(cost>60&&cost<=150){
        coup=0.1*cost;
        perc=10;
        }
        else if(cost>150&&cost<=210){
        coup=0.12*cost;
        perc=12;
        }
        else if(cost>210){
        coup=0.14*cost;
        perc=14;
        }
        System.out.print("You win a discount of $");
        System.out.printf("%2.2f", coup);
        System.out.print("("+perc+"% of your purchase)");
    }
}
