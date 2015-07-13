import java.util.Scanner;
/**
 * Write a description of class P6_10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P6_10
{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int i = 0;
    int buyers=0;
    
    do{
        System.out.println("Please enter number of desired tickets: ");
        int x = in.nextInt();
        if(x>=5){
            System.out.println("Sorry, the limit per customer is 4.");
            break;
        }
        
        
        
        i = i + x;
        int y = 100-i;
        buyers++;
        System.out.println("Remaining tickets: ");
        System.out.println(y);
        if(y==0){
        break;
        }
    }while(i<=100);
    System.out.println("Total Buyers: "+buyers);
}
}
