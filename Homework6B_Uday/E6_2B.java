import java.util.Scanner;
/**
 * Write a description of class E6_2B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E6_2B
{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter inputs: ");
       
       int i = 0;
       int even = 0;
       int odd = 0;
       while(i < 10){
           int input = in.nextInt();
                if(input%2==0){
                    even++;
                }else{
                    odd++;
                }
                
           i++;
        }
       System.out.println("Even: "+even);
       System.out.println("Odd: "+odd);
   }
}
