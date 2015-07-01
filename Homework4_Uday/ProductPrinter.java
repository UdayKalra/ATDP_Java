
/**
 * Prints original and reduced price of two Products.
 * 
 * @author Uday
 * @version 1.0
 */
public class ProductPrinter
{
   public static void main(String[] args){
       Product tab = new Product("table", 199.99);
       Product cha = new Product("chair", 49.99);
       System.out.println(tab.getName() + ": "+tab.getPrice());
       System.out.println(cha.getName() + ": "+cha.getPrice());
       tab.reducePrice();
       cha.reducePrice();
       System.out.println(tab.getName() + ": "+tab.getPrice());
       System.out.println(cha.getName() + ": "+cha.getPrice());
    }
}
