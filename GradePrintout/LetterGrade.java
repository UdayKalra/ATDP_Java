import java.util.Scanner;
/**
 * Calculates the letter grade of a studeny
 * 
 * @author Uday
 * @version 1.0
 */
public class LetterGrade
{
   public static void main(String[] args){
       try{
       Scanner in = new Scanner(System.in);
       System.out.println("Please enter your name: ");
       String name = in.next();
       System.out.println("Please enter your score: ");
       int grade = in.nextInt();
      
       String op="";
       String fullgr="";
       if(grade>=0&&grade<=59){
        fullgr = "F";
        }
        else if(grade>=60&&grade<=70){
        fullgr = "D";
        }
        else if(grade>=71&&grade<=79){
        fullgr = "C";
        }
        else if(grade>=80&&grade<=89){
        fullgr = "B";
        }
        else if(grade>=90&&grade<=100){
        fullgr = "A";
        }
        if (grade>=60&&grade<=62||grade>=71&&grade<=72||grade>=80&&grade<=82||grade>=90&&grade<=92){
        op = "-";
        }
        else if (grade>=67&&grade<=70||grade>=77&&grade<=79||grade>=87&&grade<=89||grade>=97&&grade<=100){
        op = "+";
        }
        else{
        op = "";
        }
        System.out.println(name+"'s letter grade is "+fullgr+op);
    }catch(Exception ex){
    System.out.println("Invalid Argument! Goodbye!");
    }
}
}
