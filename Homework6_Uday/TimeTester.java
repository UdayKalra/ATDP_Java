
/**
 * Tests the Time classes.
 * 
 * @author Uday
 * @version 1.0
 */
public class TimeTester
{
    // instance variables - replace the example below with your own
   
    public static void main(String[] args)
    {
        try{
        Time time1 = new Time(10,2);
        System.out.println(time1.compareTo(20,3));
    }catch(Exception ex){
    System.out.println("Invlaid argumant! Goodbye!");   
}
    }
}

