

public class Driver {

	
	public static Point GravityCenter(Point A, Point B, Point C){
		Point G;
		Point M =  A.midpoint(B);
		Point N = A.midpoint(C);
		Line CM = C.buildline(M);
		Line BN = B.buildline(N);
		G = CM.intersect(BN);
		return G;
		
	}
	
	/*public static double distance(Point A, Point B){
		double d;
		d= Math.sqrt( Math.pow((A.getX() - B.getX()),2) + Math.pow((A.getY() - B.getY()),2)); 
		return d;
	}*/
	
	
	
	/*public static Point midpoint(Point A, Point B){
		//Point M;
		double xM, yM;
		xM = (A.getX() + B.getX())/2;
		yM = (A.getY() + B.getY())/2;
		 
		return new Point(xM,yM);
	}*/
	
	
	public static void main(String [] a){
		Circle c1, c2;
		c1 = new Circle(new Point(2,0),1);
		c2 = new Circle(new Point(-2,0),2);
		System.out.println(c1.Tangent(c2));
	}
}
