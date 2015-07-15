import java.util.Random;
import java.util.Arrays;
/**
 * Write a description of class E7_13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E7_13
{
    public static void main(String[] args){
        int[] arr = new int[20];
        Random rand = new Random();
    
        for(int i=0;i<20;i++){
        int r = rand.nextInt(99); 
        arr[i]=r;
    
        }
        System.out.println("Before Sort: ");
        printArray(arr);
        Arrays.sort(arr);
        System.out.println("After Sort: ");
        printArray(arr);
        
    }
    
    private static void printArray(int[] arra){
        for(int i = 0; i<20;i++){
        System.out.println(arra[i]);
        }
    }
}
