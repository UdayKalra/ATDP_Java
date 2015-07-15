import java.util.Scanner;

 /**
 This program reads a sequence of values and prints them, marking the largest value.
 */
 public class E7_4
 {
      final static int LENGTH = 100;
    static int[] values = new int[LENGTH];
      static int currentSize = 0;
 public void sumWithoutSmallest(){
     int smallest=values[0];
     int sum = 0;
    for(int i=1;i<currentSize;i++){
    if(values[i]<smallest){
    sum = sum+smallest;
    smallest = values[i];
    
    }else{
    sum = sum+values[i];
    }
    
    }
    System.out.println("Sum: "+sum);
    System.out.println("Smallest: "+smallest);
    System.out.println("Difference: "+(sum-smallest));
}
 public static void main(String[] args)
 {
 // Read inputs
E7_4 e = new E7_4();
 System.out.println("Please enter values, Q to quit:");
 Scanner in = new Scanner(System.in);
 while (in.hasNextDouble() && currentSize < values.length)
 {
 values[currentSize] = in.nextInt();
 currentSize++;
 }
e.sumWithoutSmallest();

 
 }
 }