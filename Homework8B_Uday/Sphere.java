
/**
 * Write a description of class Cone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sphere
{
    // instance variables - replace the example below with your own
    public static double h;
    public static double r;

    /**
     * Constructor for objects of class Cone
     */
    public Sphere(double radius)
    {
        r = radius;
    }

    public static double sphereVolume(Sphere sph){
    double x = 0;
    x = (Math.pow(r,3)*Math.PI)*4/3;
    return x;
    }
    public static double sphereSurface(Sphere sph){
    double x = 0;
    x = (Math.pow(r,2)*Math.PI)*4;
    return x;
    }
}
