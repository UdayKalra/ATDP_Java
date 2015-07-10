import java.util.Scanner;
/**
 * Write a description of class E6_2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E6_2D
{
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
        
          boolean first = true;
          int previous = 0;
          String dupl = "";
          int i = 0;
          System.out.println("Enter input: ");
          while (i<10)
          {
              int input = in.nextInt();
              if (input == previous){
                dupl = dupl + " " + input;
                }
                previous = input;
               // input = in.nextDouble();
               // if (first) { first = false; }
               // else if (input == previous)
               // {
               //     String dupl = input;
               // }
               i++;
            }
            System.out.println(dupl);
    }
}
