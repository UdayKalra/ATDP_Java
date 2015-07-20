import java.util.Scanner;
/**
 * Write a description of class E8_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry
{
    
    /**
     * Constructor for objects of class E8_5
     */
    public Geometry()
    {
       
    }
    public static double cubeVolume(double h){
    double x = 0;
    x = Math.pow(h,3);
    return x;
    }
    public static double cubeSurface(double h){
    double x = 0;
    x = Math.pow(h,2)*6;
    return x;
    }
    public static double sphereVolume(double r){
    double x = 0;
    x = (Math.pow(r,3)*Math.PI)*4/3;
    return x;
    }
    public static double sphereSurface(double r){
    double x = 0;
    x = (Math.pow(r,2)*Math.PI)*4;
    return x;
    }
    public static double cylinderVolume(double r, double h){
    double x = 0;
    x = (Math.pow(r,2)*Math.PI)*h;
    return x;
    }
    public static double cylinderSurface(double r, double h){
    double x = 0;
    x = ((2*Math.PI*r)*h)+(2*(Math.pow(r,2)*Math.PI));
    return x;
    }
    public static double coneVolume(double r, double h){
    double x = 0;
    x = (Math.pow(r,2)*Math.PI)*(h/3);
    return x;
    }
    public static double coneSurface(double r, double h){
    double x = 0;
    x = (r*Math.PI)*(r+Math.sqrt(Math.pow(h,2)+Math.pow(r,2)));
    return x;
    }
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a height: "); 
    double height = in.nextDouble();
    System.out.println("Enter a radius: "); 
    double radius = in.nextDouble();
    System.out.println("Volume of a cube: "+cubeVolume(height));
    System.out.println("Surface area of a cube: "+cubeSurface(height));
    System.out.println("Volume of a sphere: "+sphereVolume(radius));
    System.out.println("Surface area of a sphere: "+sphereSurface(radius));
    System.out.println("Volume of a cylinder: "+cylinderVolume(radius,height));
    System.out.println("Surface area of a cylinder: "+cylinderSurface(radius,height));
    System.out.println("Volume of a cone: "+coneVolume(radius,height));
    System.out.println("Surface area of a cone: "+coneSurface(radius,height));
    }
}
