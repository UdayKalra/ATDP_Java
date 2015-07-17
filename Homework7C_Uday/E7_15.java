import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class E7_15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E7_15
{
     public static void main(String[] args){
         int[][] arr = new int[4][4];
         Scanner in = new Scanner(System.in);
        for(int i = 0;i<4;i++){
            
            for(int j = 0;j<4;j++){
            System.out.println("Please input a number: ");
            arr[i][j] = in.nextInt();
            }
        }
       for(int i = 0; i<4;i++){
           System.out.println();
        for(int j=0;j<4;j++){
            System.out.print(arr[i][j]);
            System.out.print(" ");
        }
        }  
        boolean elementCheck = eleCheck(arr);
        boolean totalsCheck = checkTotals(arr);
        System.out.println("Element Check returned: "+elementCheck);
        System.out.println("Totals Check returned: "+totalsCheck);
        if(elementCheck && totalsCheck){
            System.out.println("Congratulations! This is a Magic Square!");
        
        }else{
             System.out.println("Sorry! This is not a Magic Square!");
        
        }
        }
        private static boolean eleCheck(int[][] array){
            int count = 1;
            boolean bool = true;
            boolean found = false;
            while(count<17){
                found = false;
             for(int i = 0;i<4;i++){
            
            for(int j = 0;j<4;j++){
            
            if(array[i][j] == count){
                
                found = true;
                break;
            }
            
            }
            if(found == true)
            {
            break;
            }    
        }
        if (found ==false){
            System.out.println("Number not found!"+count);
            break;
        }
        count++;
        }
        return found;
        }
        private static boolean checkTotals(int[][] array){
        int origTotal = 0;
        boolean result = true;
        
        //check row totals
         for(int i = 0;i<4;i++){
             int rowTotal = 0;
            for(int j = 0;j<4;j++){
                rowTotal += array[i][j];
                if (i==0){
                origTotal = rowTotal;
                }
            }
            if(origTotal!=rowTotal){
                System.out.println("Row Totals do not match!");
                result = false;
                break;
            }
        }
        
        //check column totals
        for(int i = 0;i<4;i++){
             int columnTotal = 0;
            for(int j = 0;j<4;j++){
                columnTotal += array[j][i];
                
            }
            if(origTotal!=columnTotal){
                System.out.println("Column Totals do not match!");
                result = false;
                break;
            }
        }
        
        //check first diagonals
        int diagTotal1 = 0;
        for(int i = 0; i<4; i++){
            diagTotal1 += array[i][i];
        
        }
        if(origTotal!=diagTotal1){
            System.out.println("1st Diagonal Total does not match!");
                result = false;
            
        }
         int diagTotal2 = 0;
         int j = 3;
        for(int i = 0; i<4; i++){
            //for(int j = 3;j>=0;j--){
            diagTotal2 += array[i][j];
        j--;
        
       // }
         
    }
   // System.out.println("2nd Diagonal Total is: "+diagTotal2);
        if(origTotal!=diagTotal2){
            System.out.println("2nd Diagonal Total does not match!");
                result = false;
               
        }
        
        //System.out.println("Original Total is: "+origTotal);
        return result;
        }
    
}
