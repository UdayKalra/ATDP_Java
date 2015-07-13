import java.util.Scanner;
 
class E6_11
{
   public static void main(String args[])
   {
       try{
        System.out.print("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String str="";
        String sub= "";
        String str2sub = in.next();
        int length = str2sub.length();
        for (int i = 0; i < length; i++) {
            
            for (int j = 0; i+j <= length; j++) {
               sub = str2sub.substring(j, i + j); 
               if("".equals(sub))continue; 
               str += sub + "\n";
            }
            
        }
        System.out.print(str+str2sub);
    }catch(Exception ex){
    System.out.print("Invalid, Sorry!");
    }
}
}

