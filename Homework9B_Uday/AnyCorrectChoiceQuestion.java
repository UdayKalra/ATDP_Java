import java.util.ArrayList;
/**
 * Write a description of class AnyCorrectChoiceQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnyCorrectChoiceQuestion extends ChoiceQuestion
{
    protected ArrayList<String> answers;
    protected static int index;
     /**
     * Constructor for objects of class AnyCorrectChoiceQuestion
     */
    public AnyCorrectChoiceQuestion()
    {
        answers = new ArrayList<String>();
        answers.clear();
        index = 1;
    }
    public void addChoice(String choice, boolean correct)
    {
    super.addChoice(choice, false);
    if(correct){
        answers.add(String.valueOf(index));
       
       
    }
     index++;
    }
   public boolean checkAnswer(String response)
   {
      boolean returnVal = false;
      System.out.print("The correct choices were: ");
      for(int i =0;i<answers.size();i++){
        String x = answers.get(i);
        System.out.print(x+" ");
        if(x.equals(response)){
        returnVal = true;
    
        }
        }
     
      return returnVal;
   }
}
