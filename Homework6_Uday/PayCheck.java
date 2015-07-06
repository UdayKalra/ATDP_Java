
/**
 * Calculates Daily Wage of an employee.
 * 
 * @author Uday
 * @version 1.0
 */
public class PayCheck
{
    String x;
    double y;
    double z;
    double w;
    double u;
    double o;
    double a;
    /**
     * Creates a pay check with a name, salary rate, hour count, and overtime count.
     * @param name Name of recipient
     * @param sal Salary
     * @param hours Work Hours
     * @param overtime Overtime Hours
     */
    public PayCheck(String name,double sal, double hours, double overtime ){
    x = name;
    y = sal;
    z = hours;
    o = overtime;
    w = (y/z);
    u = w*1.5/o;
    a = w+u;
    
    }
    /**
     * Returns wage of recipient.
     * @return wage of employee
     */
    public double getWage(){
    
        return (a);
        
    }
}
