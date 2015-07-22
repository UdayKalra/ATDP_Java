import java.util.StringTokenizer;
/**
 * Write a description of class MultiChoiceQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiChoiceQuestion extends AnyCorrectChoiceQuestion
{
   

    /**
     * Constructor for objects of class MultiChoiceQuestion
     */
    public MultiChoiceQuestion()
    {
       
    }

     public boolean checkAnswer(String response)
   {
     boolean returnVal = false;
    
     StringTokenizer st = new StringTokenizer(response);
     System.out.print("The correct choices were: ");
      for(int y =0;y<answers.size();y++){
           System.out.print(answers.get(y) + " ");
      }
      if(st.countTokens() != answers.size())
        return false;
        
       String previous = null;
       
     first: while (st.hasMoreTokens()) {
         String ans = st.nextToken().trim();
     
         if(previous != null && ans.equals(previous))
            return false; //duplicate value
            
         for(int i =0;i<answers.size();i++){
           String x = answers.get(i);
     
           if(ans.equals(x)){
             returnVal = true;
             break;
           }else{
             returnVal = false;
                          
           }
         }
         if(!returnVal){
            break first;//no match
         }
         previous = ans;
     }
     
      return returnVal;
   }
    
}
