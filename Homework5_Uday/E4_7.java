import java.util.Scanner;
/**
 * Calculates volume, surface area, circumference, and area for a radius.
 * 
 * @author Uday Kalra
 * @version 1.0
 */
public class E4_7
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your radius: ");
        Double radius = in.nextDouble();
        System.out.println("Area: " +Math.pow(radius, 2)*Math.PI);
        System.out.println("Circumference: "+2*radius*Math.PI);
        System.out.println("Volume: " +(4.0/3)*Math.PI*(Math.pow(radius, 3)));
        System.out.println("Surface Area: " +Math.pow(radius, 2)*Math.PI*4);
    
    }
}
