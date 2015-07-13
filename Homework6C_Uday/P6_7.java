import java.util.Scanner;
/**
 * Write a description of class P6_7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P6_7
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your your seed: ");
        int seed = in.nextInt();
        for(int i=1;i<=100;i++){
            int x = (32310901*seed+1729);
            System.out.print(x+"\n");
            seed = x;
        }
    }
}
