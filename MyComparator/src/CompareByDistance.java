import java.util.Comparator;

public class CompareByDistance implements Comparator<Point> {
	public int compare(Point p1, Point p2){
		double d1, d2;
		d1 =  Math.sqrt(p1.getX()*p1.getX() + p1.getY()*p1.getY());
		d2 =  Math.sqrt(p2.getX()*p2.getX() + p2.getY()*p2.getY());
		return (int)(d1 - d2);
	}
}
