import java.util.Scanner;
/**
 * Write a description of class E7_17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E7_17
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");
        int[] arr = new int[5];
        int max = 0;
        final int SCALE = 40;
        for(int i = 0;i<5;i++){
            arr[i] = in.nextInt();
            if(arr[i]>max){
            max = arr[i];
            }
        }
        final int TOTAL_SCALE = 40/max;
        for(int i = 0; i<5; i++){
            int x= arr[i]*TOTAL_SCALE;
        for(int j=0;j<x;j++){
        System.out.print("*");
        }  
        
        System.out.println();
        }
        }
    }

