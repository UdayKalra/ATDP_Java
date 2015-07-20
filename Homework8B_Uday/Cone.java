
/**
 * Write a description of class Cone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cone
{
    // instance variables - replace the example below with your own
    public static double h;
    public static double r;

    /**
     * Constructor for objects of class Cone
     */
    public Cone(double radius, double height)
    {
        h = height;
        r = radius;
    }

    public static double coneVolume(Cone con){
    double x = 0;
    x = (Math.pow(r,2)*Math.PI)*(h/3);
    return x;
    }
    public static double coneSurface(Cone con){
    double x = 0;
    x = (r*Math.PI)*(r+Math.sqrt(Math.pow(h,2)+Math.pow(r,2)));
    return x;
    }
}
