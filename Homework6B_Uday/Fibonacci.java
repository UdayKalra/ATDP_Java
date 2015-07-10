import java.util.Scanner;
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    static int fnew = 0;
    static int n = 0;
    static int x = 2;
    public int compute(int n){
       if(n==0){
       // fnew= 0;
        return 0;
        }
       if(n==1){
        //fnew=1;
        return 1;
        }
       return compute(n-1)+compute(n-2);
    }
    public static void main(String[] args){
        Fibonacci fib = new Fibonacci();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your Fibonacci number: ");
        n = in.nextInt();
        
        System.out.println("The result is: "+fib.compute(n));
    }
}
