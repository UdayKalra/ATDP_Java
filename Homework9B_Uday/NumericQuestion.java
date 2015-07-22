
/**
 * Write a description of class NumericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    private double answer;
    /**
     * Constructor for objects of class NumericQuestion
     */
    public NumericQuestion()
    {
      
    }

    public void setAnswer(double correctResponse)
   {
      answer = correctResponse;
   }
   public boolean checkAnswer(double response)
   {
       if(answer==response||response==answer+0.01||response==answer-0.01){
      return true;
      }
      return false;
    }
}
