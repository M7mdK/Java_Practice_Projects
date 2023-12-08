import java.util.Scanner;


public class Driver {
	public static Scanner in = new Scanner(System.in);
	
	public static boolean Transfer(Club c1, Club c2, String pname){
		Player p;
		p = c1.SellPlayer(pname);
		if(p==null)
			return false;
		if(c2.BuyPlayer(p))
			return true;
		else{
			c1.BuyPlayer(p);
			return false;
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club c1 = new Club("Barca","Spain",10000);
		Club c2 =  new Club("Ajax","Holland", 5000);
		c1.BuyPlayer(new Player("XYZ", "Spain", 3000));
		c1.BuyPlayer(new Player("ABC", "Spain", 3000));
		System.out.println(c1);
		Transfer(c1,c2,"XYZ");
		System.out.println(c1);
		System.out.println(c2);
		
		/*Club c = new Club("Barca","Spain",10000);
		int choice = 1;
		
		while(choice ==1 && c.getBudget() >0){
			String name, country;
			double price;
			System.out.println("enter the name");
			name = in.next();
			System.out.println("enter the country");
			country = in.next();
			System.out.println("enter the price");
			price = in.nextDouble();
			
			if(c.BuyPlayer(new Player(name,country,price)))
				System.out.println("Done!");
			else
				System.out.println("Failed!");
			
			System.out.println("Another operation? enter 1 if yes");
			choice = in.nextInt();
		}
		
		System.out.println(c);*/
	}

}
