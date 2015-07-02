import java.util.Scanner;
/**
 * Converts meters to miles, inches, and feet.
 * 
 * @Uday Kalra
 * @1.0
 */
public class E4_6
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you measurement in meters: ");
        Double met = in.nextDouble();
        System.out.println("Miles: "+0.000621371*met );
        System.out.println("Inches: "+39.3701*met);
        System.out.println("Feet: "+ 3.28084*met);
    }
}
