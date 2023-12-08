import java.util.ArrayList;

public class Club {
	private String name, country;
	private double budget;
	private ArrayList<Player> Players;
	
	private int c = 0; // nbre of foreign players
	
	public Club(String name, String country, double budget){
		this.name = name;
		this.country = country;
		this.budget = budget;
		Players = new ArrayList<Player>();
	}
	
	public Player SellPlayer(String name){
		int i;
		for(i = 0 ; i< Players.size(); i ++){
			if(Players.get(i).getName().equals(name))
				break;
		}
		if(i < Players.size()){
			budget += Players.get(i).getPrice();
			if(!Players.get(i).getHomeCountry().equals(country))
				c--;
			return Players.remove(i);
		}
		else
			return null;
		
		
	}
	
	public boolean BuyPlayer(Player p){
		if(p.getPrice() > budget)
			return false;
		if(!(p.getHomeCountry().equals(country))){
			if(c>=1)
				return false;
			c++;
		}
		
		budget -= p.getPrice();
		Players.add(p);
		return true;
	}
	
	public Player MostPaidPlayer(){
		double max = 0;
		Player p;
		Player mpp = null;
		for(int i = 0 ; i <Players.size() ; i++){
			p = Players.get(i);
			if(p.getPrice() > max){
				mpp = p;
				max = p.getPrice();
			}				
		}
		
		return mpp;
			
	}
	
	public String toString(){
		String s = " Name : " + name + "\t" + "Budget : " + budget + "\n";
		s += "******************************\n";
		if(Players.size() > 0) {
			s += "The players are : \n";
			for(int i = 0; i < Players.size(); i++){
				s += Players.get(i) + "\n";
			}		
			s += "=================================\n";
			s += "the MPP is " + MostPaidPlayer() + "\n";
			s += "=================================\n";

		}
		else{
			s+="There are no players!!\n";
		}
		
		return s;
	}
	
	public double getBudget(){
		return budget;
	}
}
