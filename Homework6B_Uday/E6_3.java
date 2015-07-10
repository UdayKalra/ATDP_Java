import java.util.Scanner;
/**
 * Write a description of class E6_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E6_3
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter input: ");
        String line = in.nextLine();
        char [] arr = line.toCharArray();
        System.out.print("Uppercase Letters: ");
        for(int i =0; i<line.length();i++){
            if(Character.isUpperCase(arr[i]))
            {
                System.out.print(arr[i]+ " ");
            }
            
        }
        System.out.print("\n");
        int count = 0;
        int vowels = 0;
        String positions = "";
        System.out.print("Alternate Letters in a Word(ignoring spaces): ");
        for(int i =0; i<line.length();i++){
            //Spaces are not counted as letters.
                if(arr[i] == ' '){
                    //i++;
                    count = 0;
                    continue;
                }
                if(count == 1){
                   
                  System.out.print(arr[i]+ " ");
               // i++;
                count =0;
            }else
                count++;
                
            if(arr[i] == 'a'||arr[i] == 'e'||arr[i] == 'i'||arr[i] == 'o'||arr[i] == 'u'||  
            arr[i] == 'A'||arr[i] == 'E'||arr[i] == 'I'||arr[i] == 'O'||arr[i] == 'U'){
            arr[i]='_';
            vowels++;
            positions = positions +i+" ";
            
            }
            
        }
        System.out.print("\n Without vowels: "+ new String(arr));
        System.out.print("\n Number of vowels: "+vowels);
        System.out.print("\n Postion of vowels: "+positions);
    }
}
