
/**
 * Write a description of class Cone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cube
{
    // instance variables - replace the example below with your own
    public static double h;

    /**
     * Constructor for objects of class Cone
     */
    public Cube(double height)
    {
        h = height;
    }

    public static double cubeVolume(Cube cub){
    double x = 0;
    x = Math.pow(h,3);
    return x;
    }
    public static double cubeSurface(Cube cub){
    double x = 0;
    x = Math.pow(h,2)*6;
    return x;
    }
}
