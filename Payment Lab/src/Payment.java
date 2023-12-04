/*
public class Payment {
	protected double Amount;
	protected String Currency;
	
	public Payment(double A , String C){
		if(C.equalsIgnoreCase("LBP") || C.equalsIgnoreCase("USD") || C.equalsIgnoreCase("Euro")){
			Amount = A;
			Currency = C;
		}
		else{
			System.out.println("Sorry we only accept LBP , USD or Euro \n");
			Amount = -1;
		}
	}
	
	
	// No need:
	//public double getAmount(){
	//	return Amount;
	//}
	//public String getCurrency(){
	//	return  Currency;
	//}
	
	public double convert(){
		if(Currency.equalsIgnoreCase("LBP"))
			return Amount;
		if(Currency.equalsIgnoreCase("USD"))
			return Amount*1500;
		if(Currency.equalsIgnoreCase("Euro"))
			return Amount*2250;
		
		return -1;
	}
	
	public String toString(){
		if(Amount == -1)
			return "Your payment wasn't consedered";
		
		return "Amount value: " + Amount + "\nCurrency: " + Currency + "\nEquivalent LBP: " + convert();
	}
}
*/









abstract class Payment{
	public abstract void pay();
	
	static public void sayHi(){
		System.out.println("Im Payment");
	}
}








