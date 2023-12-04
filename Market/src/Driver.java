
public class Driver {
	
	public static void main(String args[]){
		
		Product p1 = new Product("0123456789" , "prodA" , 1 , "addidas");
		Product p2 = new Product("8765" , "prodB" , 7 , "nike");
		Product p3 = new Product("2345678987565" , "prodC" , 2 , "addidas");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		if(p1.sameMark(p3))
			System.out.println(p1.getName() + " and " + p3.getName() + " are of the same mark");
		if(!(p1.sameMark(p2)))
			System.out.println(p1.getName() + " and " + p2.getName() + " are not of the same mark");
	}
}
