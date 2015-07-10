import java.util.Scanner;
/**
 * Write a description of class DataSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataSet
{
    static double count;
    static double total;
    static double average;
    static double sDeviation;
    static double [] num;
    static int counter;
    /**
     * Constructor for objects of class DataSet
     */
    public DataSet()
    {
        // initialise instance variables
        count = 0;
        total = 0;
        average = 0;
        sDeviation = 0;
        counter = 0;
        System.out.println("Initializing.");
    }
    public void add(double d){
        total = total + d;
        count++;    
    }
    public double getAverage(double tot, double cnt){
        double avg = tot/cnt;
        return avg;
    
    }
    public double getStandardDeviation(){
        double num2 = 0;
        for(int i = 0;i<count;i++){
             num2 += subSquare(num[i]);
             
        }
        double num3 = getAverage(num2, count);
        return Math.sqrt(num3);
    }
    public double subSquare(double val){
        double x = val - average;
        return Math.pow(x, 2);
    }
    public static void main(String[] args){
        DataSet ds = new DataSet();
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers will you be inputting: ");
        counter = in.nextInt();
        num = new double[counter];
        double input = 0;
        int i = 0;
        do{
        System.out.println("Enter a number: ");
        input = in.nextDouble();
        ds.add(input); 
        num[i]=input;
        i++;
        }while(i <counter);
        average = ds.getAverage(total, count);
        sDeviation = ds.getStandardDeviation();
        System.out.println("Count: "+count);
        System.out.println("Average: "+average);
        System.out.println("Standard Deviation: "+sDeviation);
    }
    
}
