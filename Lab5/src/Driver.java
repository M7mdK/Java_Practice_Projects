import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static ArrayList<Account> A = new ArrayList<Account>();
	
	public static Scanner in = new Scanner(System.in);
	
	public static int menu(){
		
		System.out.println("\n Choose:");
		System.out.println("1. Create account \n" +
                "2. Remove account (from the ArrayList), given its ID. \n" +
                "3. credit money to an account given its ID \n" +
                "4. debit money from an account given its ID \n" +
                "5. Transfer money from an account to another. \n" +
                "6. Print the list of available accounts. \n" +
                "otherwise. Quit");
		
		int choice = in.nextInt();
		return choice;
	}
	
	public static int searchAccount(String id){
		for(int i=0 ; i<A.size() ; i++)
			if(A.get(i).getId().equals(id))
				return i;
		
		return -1;
		
		/*
		OR: function that return Account:
		  for(int i=0 ; i<A.size() ; i++)
			if(A.get(i).getId().equals(id))
				return A.get(i);
		
		return null;
		*/
	}
	public static void createNewAccount(){
		String name, id;
		int balance;
		System.out.println("Enter id , name then balance for your new account");
		id = in.next();
		name = in.next();
		balance = in.nextInt();
		Account Acc = new Account(id,name,balance);
		A.add(Acc);
	}
	
	public static void removeAccount(){
		
		
		String id;
		System.out.println("Enter the id of the account you want to remove: \n");
		id = in.next();
		int i = searchAccount(id);
		if(i!=-1){
			A.remove(i);
			System.out.println("Account removed succesfully\n");
		}
		else{
			System.out.println("Account is already not available \n");
		}
		
		
		/*
		OR: if function searchAccount returns an account:
		Account Acc = searchAccount(id);
		if(Acc!=null){
			A.remove(Acc);
			System.out.println("Account removed\n");
		}*/	
	}
	
	public static void credit(){
		String id;
		System.out.println("Enter the id of the account you want to credit money to: \n");
		id = in.next();
		int amount;
		System.out.println("Enter the amount you want to credit: \n");
		amount = in.nextInt();
		int i = searchAccount(id);
		if(i==-1){
			System.out.println("Unavailable Account! \n");
		}
		else{
			A.get(i).credit(amount);
			System.out.println("Done! \n");
		}
	}
	
	public static void debit(){
		String id;
		System.out.println("Enter the id of the account you want to debit money from: \n");
		id = in.next();
		int amount;
		System.out.println("Enter the amount you want to debit: \n");
		amount = in.nextInt();
		int i = searchAccount(id);
		if(i==-1){
			System.out.println("Unavailable Account! \n");
		}
		else{
			A.get(i).debit(amount);
			System.out.println("Done! \n");
		}
	}
	
	public static void transferTo(){
		String id1 , id2;
		System.out.println("Enter the id of the account you want to transfer from\n"
				+ "then that of the account you want to transfer to: \n");
		id1 = in.next();
		id2 = in.next();
		int amount;
		System.out.println("Enter the amount you want to transfer: \n");
		amount = in.nextInt();
		int i = searchAccount(id1);
		int j = searchAccount(id2);
		if(i==-1 || j==-1){
			if(i==-1)
				System.out.println("First entered account is unavailable!");
			if(i==-1 && j==-1)
				System.out.println("And");
			if(j==-1)
				System.out.println("Second entered account is unavailable! \n");
		}
		else{
			A.get(i).transferTo(A.get(j), amount);
			System.out.println("Done!\n");
		}
	}
	
	public static void printAccountsList(){
		System.out.println("\n List of Accounts we have now is:");
		for(int i=0 ; i<A.size() ; i++)
			System.out.println(A.get(i));
	}
	
	
	public static void main(String[] args) {
		
		int c;
		
		do{
			c = menu();
				if(c==1){
					createNewAccount();
				
				}
				if(c==2){
					removeAccount();
				}
				if(c==3){
					credit();
				}
				if(c==4){
					debit();
				}
				if(c==5){
					transferTo();
				}
				if(c==6){
					printAccountsList();
				}
		
		}while(c==1 || c==2 || c==3 || c==4 || c==5 || c==6);
		
		
		/*
		TEST:
		Account A = new Account("123" , "mhmd" , 1000);
		A.setBalance(200);
		System.out.println(A);
		
		A.credit(700);
		System.out.println(A);
		A.debit(100);
		System.out.println(A);
		
		Account B = new Account("456" , "Ali" , 100);
		A.transferTo(B,2000);
		System.out.println(A);
		System.out.println(B);
		*/
		
	}

}
