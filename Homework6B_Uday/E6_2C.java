import java.util.Scanner;
/**
 * Write a description of class E6_2C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E6_2C
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Inputs: ");
        
        int i = 0;
        int sum = 0;
        while(i<10){
            int input = in.nextInt();
            sum = sum+input;
            i++;
        }
        System.out.print(sum);
    
}
}
