
/**
 * Write a description of class P6_16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P6_15
{
    public static void main(String[] args){
        try{
        for(int i = 1;i<=24;i++){
        double x = Math.exp((-i*Math.log(2))/6);
        System.out.println("Relative Amount for Hour "+i+": "+x);
        }
    }catch(Exception ex){
    System.out.print("Invalid! Sorry.");
    }
}
}
