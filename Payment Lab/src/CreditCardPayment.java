/*
public class CreditCardPayment extends Payment {
	
	private int CardNumber;
	
	public CreditCardPayment(double A , String C , int CN){
		super(A,C);
		CardNumber = CN;
	}

	public int getCardNumber() {
		return CardNumber;
	}
	
	public boolean Authorize(){
		double AmountInLBP = convert();
		if(AmountInLBP < 1000000)
			return true;
		
		return false;
	}
	
	public String toString(){
		if(Authorize()){
			return "Card Number= " + CardNumber + "\n" + super.toString() + "\n";
		}
		else{
			return "Operation failed";
		}
	}
	
}
*/









public class CreditCardPayment extends Payment{
	
	public void pay(){
		System.out.println("This CreditCardPayment is fair!");
	}
}






