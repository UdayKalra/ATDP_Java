import java.util.Scanner;
/**
 * Write a description of class E8_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E8_6
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a height: "); 
        double height = in.nextDouble();
        System.out.println("Enter a radius: "); 
        double radius = in.nextDouble();
        Cube cub = new Cube(height);
        Sphere sph= new Sphere(radius);
        Cylinder cyl = new Cylinder(height, radius);
        Cone con = new Cone(height, radius);
        System.out.println("Volume of a cube: "+cub.cubeVolume(cub));
        System.out.println("Surface area of a cube: "+cub.cubeSurface(cub));
        System.out.println("Volume of a sphere: "+sph.sphereVolume(sph));
        System.out.println("Surface area of a sphere: "+sph.sphereSurface(sph));
        System.out.println("Volume of a cylinder: "+cyl.cylinderVolume(cyl));
        System.out.println("Surface area of a cylinder: "+cyl.cylinderSurface(cyl));
        System.out.println("Volume of a cone: "+con.coneVolume(con));
        System.out.println("Surface area of a cone: "+con.coneSurface(con));
    }
}
