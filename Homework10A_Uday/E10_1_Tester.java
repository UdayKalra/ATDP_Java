
/**
   This program demonstrates the measurable BankAccount and Country classes.
*/
public class E10_1_Tester
{
   public static void main(String[] args)
   {
      Measurable[] accounts = new Measurable[3];
      accounts[0] = new BankAccount(0);
      accounts[1] = new BankAccount(10000);
      accounts[2] = new BankAccount(2000);

      /*double averageBalance = Data.average(accounts);
      System.out.println("Average balance: " + averageBalance);
      System.out.println("Expected: 4000");*/
      Measurable a = Data.max(accounts);
      double b = a.getMeasure();
      
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      /*double averageArea = Data.average(countries);
      System.out.println("Average area: " + averageArea);
      System.out.println("Expected: 239950")*/;
      Measurable x = Data.max(countries);
      String y = x.getName();
      
      System.out.println("\nE10.1");
      System.out.print("\nLargest Country: "+y);
      System.out.print("\nExpected: Thailand");
      System.out.print("\nBank Account Value: "+b);
      System.out.print("\nExpected: 10000");
   }
}
