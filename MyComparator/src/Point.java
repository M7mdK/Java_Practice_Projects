
public class Point implements Comparable<Point> {
	private double x ,y ;
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Point p){
		return (int)(x - p.x);
	}
	
	public String toString(){
		return x + ";" + y;
	}
}
