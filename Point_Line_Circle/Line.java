
public class Line {
	private double a, b;
	
	public Line(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public Line(Point p1, Point p2){
		a = (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
		b = p1.getY() - a * p1.getX();			
	}
	
	public String toString(){
		return "y=" + a + "x" + " + " + b;
	}
	
	/*public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public boolean perpendicular (Line l){
		return (this.a * l.a == -1);
	}*/
	
	/*public boolean holds(Point p){
		return (p.getY() == a * p.getX() + b);
	}*/
	
	public Point intersect (Line l){
		double x , y;
		x =  (b - l.b) / (l.a - a);
		y = a * x + b;
		
		return new Point(x,y);
	}
}
