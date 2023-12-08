
public class Circle {
	private double radius;
	private Point center;
	
	public Circle(double x, double y, double radius){
		center = new Point(x,y);
		this.radius = radius;
	}
	
	public Circle(Point center, double radius){
		this.center = center;
		this.radius = radius;
	}
	
	public int Tangent(Circle c){
		if ( (radius + c.radius) == center.distance(c.center))
			return 1;
		if ( Math.abs(radius - c.radius) == center.distance(c.center))
			return -1;
		
		return 0;
	}
	
	public String toString(){
		return "[" + center + ";" + radius + "]";
	}
	
}
