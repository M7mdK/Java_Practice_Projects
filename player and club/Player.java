public class Player {
	private  String Name, HomeCountry;
	private double Price;
	
	
	public Player(Player P)
	{
		this.HomeCountry=P.HomeCountry;
		this.Name=P.Name;
		this.Price=P.Price;
	}
	
	public Player(String Name,String HomeCountry,double price)
	{
		this.HomeCountry=HomeCountry;
		this.Name=Name;
		this.Price=price;
	}


	public String getName() {
		return Name;
	}


	public String getHomeCountry() {
		return HomeCountry;
	}


	public double getPrice() {
		return Price;
	}
	
	public String toString() 
	{
		return "[Name: "+Name+", HomeCountry: "+HomeCountry+", Price: "+Price+"]";
	}
	
}