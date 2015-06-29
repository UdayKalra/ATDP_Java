/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class SavingAccount
{  
   // private instance variables—filled in later
  private double balance;
  public double interest;
   /**
      Constructs a bank account with a zero balance.
   */
   public SavingAccount()
   {   
      balance=1000;
      interest=0.10*balance;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public SavingAccount(double initialBalance)
   {   
      // implementation—filled in later
      balance=initialBalance;
    }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void addInterest()
   {  
      // implementation—filled in later
      balance=balance+interest;
   }
   
   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      // implementation—filled in later
      balance=balance-amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      // implementation—filled in later
      return balance;
   }


}
