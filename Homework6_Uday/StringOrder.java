import java.util.Scanner;
/**
 * Determines the lexicographical order of three strings.
 * @author Uday
 * @version 1.0
 */
public class StringOrder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first string: ");
		String x = in.next();
		System.out.print("Please enter first string: ");
		String y = in.next();
		System.out.print("Please enter first string: ");
		String z = in.next();
		String order1 = x;
		String order2 = y;
		String order3  = z;
		
			
		if(order1.compareTo(order2) > 0){
			//swap order1 and order2
			String temp = order1;
			order1 = order2;
			order2 = temp;
		}
		
		if(order3.compareTo(order2) < 0){
			//swap order2 and order3
			String temp = order2;
			order2 = order3;
			order3 = temp;
		
			if(order2.compareTo(order1) < 0){
				//swap order1 and order2
				String temp2 = order1;
				order1 = order2;
				order2 = temp2;
			}
		}
		
		System.out.println(order1);
		System.out.println(order2);
		System.out.println(order3);

	}

}
