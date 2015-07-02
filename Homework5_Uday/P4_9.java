import java.util.Scanner;
/**
 * Write a description of class P4_9 here.
 * 
 * @author Uday 
 * @version 1.0
   */
public class P4_9
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your initial balance: ");
        double init  = in.nextDouble();
        System.out.println("Please enter the annual interest rate in percent: ");
        double inte = in.nextDouble();
        System.out.format("%.2f%n", init);
        System.out.println("Initial Balance: "+init);
        System.out.println("Annual Interest Rate in Percent: "+inte);
        double inter = inte/100.0;
        double bal3 = init*Math.pow((1+inter/12),12*0.25);
        double bal2 = init*Math.pow((1+inter/12),12*(1/6.0));;
        double bal1 = init*Math.pow((1+inter/12),12*(1/12.0));
        System.out.print("After first month: ");
        System.out.format("%.2f%n", bal1);
        System.out.print("\nAfter second month: ");
        System.out.format("%.2f%n", bal2);
        System.out.print("\nAfter third month: ");
        System.out.format("%.2f%n", bal3);
        
    }
}
