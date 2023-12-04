
public class PolyDriver {

	public static void main(String[] args) {
		
		Polynom p = new Polynom(6,1,6);
		double r[] = p.Roots();
		
		if(r[0]==r[1])
			System.out.println("The polynomial " + p + " has a double root " + r[0]);
			
		if(r[0] == r[0] && r[0] != r[1])
			System.out.println("The polynomial " + p + " has two roots " + r[0] + " and " + r[1]);
		
		if(r[0] != r[0] && r[0] != r[1])
		System.out.println("No roots");
	}
}
