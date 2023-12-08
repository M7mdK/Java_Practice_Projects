import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	public static void main(String [] a){
		Point p1 = new Point(2,4);
		Point p2 = new Point(3,5);
		ArrayList<Point> x = new ArrayList<Point>();
		x.add(p1);
		x.add(p2);
		x.add(new Point(0,1));
		Collections.sort(x, new CompareByDistance());				
		Arrays.sor
		Collections.sor
		System.out.println(x.get(0));
		Collections.reverse(x);
		System.out.println(x.get(0));
	}
}
