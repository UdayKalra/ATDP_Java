import java.util.Scanner;
/**
 * Write a description of class E6_16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E6_16
{
   public static void main(String[] args){
       System.out.print("Enter side length: ");
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
        for (int i = -num; i < num; i++) {
      for (int j = -num; j < num; j++) {
        if (Math.abs(i) + Math.abs(j) < num) 
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("\n");
    }
   }
}
