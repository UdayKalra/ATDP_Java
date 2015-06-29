/**
   A class to test the SavingAccount class.
*/
public class SavingAccountTester
{
   /**
      Tests the methods of the SavingAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      SavingAccount NewChecking = new SavingAccount();
      NewChecking.addInterest();
      System.out.println(NewChecking.getBalance());
      System.out.println("Expected: 1100");      
   }
}
