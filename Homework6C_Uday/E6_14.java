
/**
 * Write a description of class E6_14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E6_14
{
    public static void main(String[] args){
        try{
        for(int x = 1;x<=10;x++){
            for(int y = 1;y<=10;y++){
            int w=x*y;
            int length = (int) Math.log10(w) + 1;
            if(length==1){
            System.out.print(w+"   ");
            
            }
            else if(w == 90){
            System.out.print(w+" ");
            
            }
            else if(length==2){
            System.out.print(w+"  ");
            
            }
            else{
            System.out.print(w);
            
            }
            }
            System.out.print("\n");
        }
    }catch(Exception ex){
    System.out.println("Invalid! Sorry.");
    }
}
}
