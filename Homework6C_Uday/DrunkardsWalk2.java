import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class DrunkardsWalk2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrunkardsWalk2
{public static void main(String[] args){
    try{
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter your starting x-coordinate: ");
    int x = in.nextInt();
    System.out.println("Please enter your starting y-coordinate: ");
    int y = in.nextInt();
    int a = x;
    int b  = y;
    for(int i=0;i<100;i++){
        Random rand = new Random();
        int d = 1 + rand.nextInt(4);
        if(d == 1){
         b+=1;
        }
        else if(d == 2){
         a+=1;
        }
        else if(d == 3){
         b-=1;
        }
        else if(d == 4){
         a-=1;
        }
        
        }
     int big = Math.max(a, x);
     int big2 = Math.max(b, y);
     int small = Math.min(a, x);
     int small2 = Math.min(b, y);
     int width = big - small;
     int height = big2 - small2;
     for(int j=1;j<=height;j++){
        for(int h=1;h<=width;h++){
            if(h==1&&j==1&&width>=1){
                System.out.print("E");
            
        }else if(h==width&&j==1&&width<=0){
                System.out.print("E");
        
        }else if(h==width&&j==height&&height>=1){
                System.out.print("S");
            
        }else if(h==1&&j==height&&width<=0){
                System.out.print("S");
        
        }
        else{
                System.out.print("-");
                }}
        System.out.print("\n");
        }
         System.out.print(a+", "+b);
        }
     catch(Exception ex){
    System.out.print("Invalid! Sorry.");
    }
        
       
}}
