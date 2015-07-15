import java.util.Random;
/**
 * Write a description of class E7_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E7_1
{
    public static void main(String[] args){
        int[] arr = new int[10];
        Random rand = new Random();
        for(int i=0;i<=9;i++){
        int r = 1+rand.nextInt(100); 
        arr[i]=r;
        }
        System.out.print("Even index: ");
        for(int i=0;i<=9;i++){
            if(i%2==0){
        System.out.print(arr[i]+" ");
        }
    }
    System.out.println();
    System.out.print("Even elements: ");
    for(int i=0;i<=9;i++){
            if(arr[i]%2==0){
        System.out.print(arr[i]+" ");
        }
    }
    System.out.println();
    System.out.print("Reverse elements: ");
    for(int i=9;i>=0;i--){
        System.out.print(arr[i]+" ");
        }
    System.out.println();
    System.out.print("First and Last Elements: "+arr[0]+" "+arr[9]);
    
    }
}
