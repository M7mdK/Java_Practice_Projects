
public class Polynom {
	private double a,b,c;
	
	public Polynom(double x , double y , double z){
		a=x;
		b=y;
		c=z;
	}
	
	public String toString(){
		
			if(a==1 && b!=1){
				return "x^2 + " + b + "x + " + c;
			}
			if(b==1 && a!=1){
				return a + "x^2 + x + " + c;
			}
			if(a==1 && b==1){
				return "x^2 + x + " + c;
			}
		
			return a + "x^2 + " + b + "x + " + c;
	}
	
	
	public double[] Roots(){
		double d= b*b - 4*a*c;
		double R[] = new double[2];
		if(d<0){
			R[0] = Double.NaN;
			R[1] = Double.NaN;
		}
		if(d>0){
			R[0] = (-b + Math.sqrt(d))/(2*a);
			R[1] = (-b - Math.sqrt(d))/(2*a);
		}
		if(d==0){
			R[0] = R[1] = -b/(2*a);
		}
		return R;
	}
}
