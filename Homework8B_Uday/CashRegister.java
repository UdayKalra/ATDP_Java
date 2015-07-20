
/**
 * Write a description of class CashRegister here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CashRegister
{
    private static double purchase=0;
    public static double payment=0;
    public static Coin nickel = new Coin(0.05, "Nickel");
    public static Coin penny = new Coin(0.01, "Penny");
    public static Coin dime = new Coin(0.1, "Dime");
    public static Coin quarter = new Coin(0.25, "Quarter");
    public static void recordPurchase(double amount){
        purchase = purchase + amount;
    }
    public static void receivePayment(int coinCount, Coin coinType)
{
payment = payment + coinCount * coinType.getValue();
}
public static double giveChange(Coin coinType){
    double change = payment-purchase;
    purchase = 0;
    payment = 0;
    return change/(coinType.getValue());
}
public static void main(String[] args){
recordPurchase(3);
System.out.println("Your purchase total is: "+purchase);
receivePayment(1, nickel);
receivePayment(2, penny);
receivePayment(3, dime);
receivePayment(12, quarter);
System.out.printf("%.2f", payment);
System.out.println(" is your payment.");
System.out.print("Your change is: "+giveChange(nickel)+" "+nickel.getName());

}
}
