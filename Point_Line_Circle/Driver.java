

public class Driver {

	public static double distance(Point A, Point B){
		double d;
		d= Math.sqrt( Math.pow((A.x - B.x),2) + Math.pow((A.y - B.y),2)); 
		return d;
	}
	
	public static void changex(Point A){
		A = new Point(1,1);
		A.x = 5;
	}
	
	public static void main(String [] a){
		Point p, t;
		p = new Point(1,1);
		changex(p);
		new Point();
		//t = new Point(2,3);
		//System.out.println(distance(p,t));
		System.out.println(p.x);
		
		//p.WithTheUnitCircle();
		//System.out.println(p.WithTheCircle(2));
		
		//new Point();
		//p.x = 2;
		//p.y = 5;
		//p.f();
	}
}








