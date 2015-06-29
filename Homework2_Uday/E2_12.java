import java.util.Random;

public class E2_12
{
    public static void main(String[] args){
        Random ran = new Random();
        // System.out.println(ran.nextInt((19 - 10 + 1) + 10));
        // System.out.print(ran.nextFloat());
         double result = Math.random() * (19.95 - 10.00) + 10.00;
         System.out.print("$");
          System.out.format("%.2f%n", result);
    }
        

}
