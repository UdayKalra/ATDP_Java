import java.util.Scanner;
/**Write a description of class E6_9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E6_9
{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String line = in.next();
        char arr [] = line.toCharArray();
        for(int i=line.length()-1;i >= 0;i--){
            System.out.print(arr[i]);
        }
    }
}
