/**
 * @author Uday Kalra
 * @version 1.0
 * A product has a name and price. The price can be modified.
 */
public class Product
{
    public String name;
    public double price;
    

/**
 * Makes a product with a name and price
 * @param x The name of the Product.
 * @param y The price of the Product.
 */
public Product(String x,double y){
name = x;
price = y;
}
/**
 * Returns the name of the product.
 */
public String getName(){
return name;
}
/**
 * Returns the price of the product.
 */
public double getPrice(){
return price;
}
/**
 * Reduces the pric eof the object by 5 dollars.
 */
public void reducePrice(){
price = price-5.00;

}
}