import java.util.Scanner;

/**
   This program shows a simple quiz with two question types.
*/
public class QuestionDemo
{
   public static void main(String[] args)
   {
      Question first = new Question();
      first.setText("Who was the inventor of Java?");
      first.setAnswer("James Gosling");      

      ChoiceQuestion second = new ChoiceQuestion();
      second.setText("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);
      
      NumericQuestion third = new NumericQuestion();
      third.setText("What is 1 divided by 3?");
      third.setAnswer(3.33);
      
      AnyCorrectChoiceQuestion fourth = new AnyCorrectChoiceQuestion();
      
      fourth.setText("Which are colors of the Rainbow? \nPlease select one: ");
      fourth.addChoice("Black", false);
      fourth.addChoice("Red", true);
      fourth.addChoice("Pink", false);
      fourth.addChoice("Green", true);
      
      MultiChoiceQuestion fifth = new MultiChoiceQuestion();
      
      fifth.setText("Which are colors of the Rainbow? \nPlease select all separated by a space: ");
      fifth.addChoice("Black", false);
      fifth.addChoice("Red", true);
      fifth.addChoice("Pink", false);
      fifth.addChoice("Green", true);
      
      presentQuestion(first);
      presentQuestion(second);
      presentQuestion(third);
      presentQuestion(fourth);
      presentQuestion(fifth);
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(Question q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      if(q instanceof NumericQuestion){
      double response = in.nextDouble();
      System.out.println(((NumericQuestion)q).checkAnswer(response));
    }else if(q instanceof AnyCorrectChoiceQuestion||q instanceof MultiChoiceQuestion){
        String response = in.nextLine();
        boolean x = q.checkAnswer(response);
        if(x){
        System.out.println("\nYour answer was correct! ");
        }else{
        System.out.println("\nYour answer was incorrect! ");
        }
     }else{
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
    }
   }
}

