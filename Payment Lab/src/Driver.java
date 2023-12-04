/*
import java.util.Scanner;

public class Driver {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void ReadArray(CreditCardPayment PAY[]){
		for(int i=0 ; i<PAY.length ; i++){
			System.out.println("Enter Amount , Currency then CardNumber for the nb" + i + " creditCardPayment \n");
			double A = in.nextDouble();
			String C = in.next();
			int CN = in.nextInt();
			PAY[i] =new CreditCardPayment(A , C, CN);
		}
	}
	
	public static void sort(CreditCardPayment PAY[]){
		
		for(int i=0 ; i<PAY.length -1 ; i++){
			for(int j=i+1 ; j<PAY.length ; j++){
				if(PAY[i].convert() > PAY[j].convert()){
					CreditCardPayment temp = PAY[i];
					PAY[i] = PAY[j];
					PAY[j] = temp;
				}
			}
		}
		
	}
	
	public static void PrintArray(CreditCardPayment PAY[]){
		for(int i=0 ; i<PAY.length ; i++){
			System.out.println(PAY[i]);
		}
	}
	
	public static void main(String[] args) {
		
		CreditCardPayment PAY[] = new CreditCardPayment[4];
		ReadArray(PAY);
		sort(PAY);
		PrintArray(PAY);
	}

}
*/










public class Driver{
	
	public static void main(String args[]){
		
		
		Payment P[] = new Payment[2];
		P[0] = new CreditCardPayment();
		P[1] = new CashPayment();
		
		
		for(int i=0 ; i<2; i++){
			P[i].pay();
		}
		
	}
}












