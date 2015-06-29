/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   // private instance variables—filled in later
  private double balance;
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      
      balance=0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      // implementation—filled in later
      balance=initialBalance;
      BankAccount harrysChecking = new BankAccount(1000);
    }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      // implementation—filled in later
      balance=balance+amount;
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
