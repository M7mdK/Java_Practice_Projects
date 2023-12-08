
public class Point {
	double x;
	double y;
	
	public Point(){
		System.out.println("hi");
		new Point();
	}
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	private void f(){
		System.out.println(x + "+" + y);
	}
	
	public void WithTheUnitCircle(){
		double d;
		f();
		d= Math.sqrt(x*x + y*y);
		if(d < 1)
			System.out.println("inside");
		else if (d == 1)
			System.out.println("ON");
		else
			System.out.println("outside");
	}
	
	public int WithTheCircle(double r){
		double d = Math.sqrt(x*x + y*y);
		if(d > r)
			return 1;
		if (d < r)
			return -1;
		return 0;
	}
}
