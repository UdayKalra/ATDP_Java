import java.awt.Point;
public class E2_13
{
    public static void main(String[] args){
        Point ex = new Point(3,4);
        Point why = new Point(-3,-4);
        System.out.println(ex.distance(why));
        System.out.print("Expected: 10.0");
}
}
