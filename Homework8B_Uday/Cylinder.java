
/**
 * Write a description of class Cone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cylinder
{
    // instance variables - replace the example below with your own
    public static double h;
    public static double r;

    /**
     * Constructor for objects of class Cone
     */
    public Cylinder(double radius, double height)
    {
        h = height;
        r = radius;
    }

    public static double cylinderVolume(Cylinder cyl){
    double x = 0;
    x = (Math.pow(r,2)*Math.PI)*h;
    return x;
    }
    public static double cylinderSurface(Cylinder cyl){
    double x = 0;
    x = ((2*Math.PI*r)*h)+(2*(Math.pow(r,2)*Math.PI));
    return x;
    }
}
