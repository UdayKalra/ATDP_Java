import java.util.Random;
/**
 * Write a description of class P6_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P6_6
{
    public static void main(String[] args){
        int x=0;
        int y=0;
        for(int i=0;i<100;i++){
        Random rand = new Random();
        int d = 1 + rand.nextInt(4);
        if(d == 1){
         y+=1;
        }
        else if(d == 2){
         x+=1;
        }
        else if(d == 3){
         y-=1;
        }
        else if(d == 4){
         x-=1;
        }
        
        }
        System.out.println("The Drunkard went from (0,0) to: ("+x + ","+y+") after 100 intersections");
    }
}
