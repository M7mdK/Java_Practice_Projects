
public class Account {
	
	private String id , name;
	private int balance = 0;
	
	public Account(String ID , String Name){
		id=ID;
		name = Name;
	}
	
	public Account(String ID , String Name , int Balance){
		id=ID;
		name = Name;
		balance = Balance;
	}
	
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int b){
		balance = b;
	}
	
	public int credit(int amount){
		balance += amount;
		return balance;
	}
	
	public int debit(int amount){
		if(amount>balance){
			System.out.println("Amount exceeds balance");
			return balance;
		}
			balance =balance - amount;
			return balance;
	}
	
	public int transferTo(Account B , int amount){
		/*if(amount>balance){
			System.out.println("exceeds");
			return balance;
		}
		balance -= amount;
		B.balance += amount;
		
		return balance;
		*/
		if(amount<=balance){
		 B.credit(amount);
		 balance -= amount;
		 return balance;
		}
		System.out.println("Can't transfer , amount exceeds balance");
		return balance;
	}
	
	public String toString(){
		return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
	}
	
}
