import java.util.*;
public class Driver {
	
	public static Scanner in = new Scanner(System.in);
	public static ArrayList<UserAccount> Receivers = new ArrayList<UserAccount>();
	
	public static UserAccount CreateAccount(){
			System.out.println("Enter FN , LN and password \n");
			String FN = in.next();
			String LN = in.next();
			String Pass = in.next();
			while(Pass.length()<8 || Pass.equals(Pass.toLowerCase())){
				System.out.println("Enter a password of minimum 8 characters,"
						+ " and contains at least of one capital letter");
				Pass = in.next();
			}
			return new UserAccount(FN , LN , Pass);
		}
	
	public static void Friends(UserAccount UA){
		int check = 0;
		ArrayList<UserAccount> T = new ArrayList<UserAccount>();
		
		for(int i=0 ; i<UA.getMailBox().size() ; i++){
			UserAccount u = UA.getMailBox().get(i).getSender();
			/*for(int j=0 ; j < T.size() ; j++){
				if(T.get(j).equals(u)){
					check = 1;
					break;
				}	
			}*/
			if(T.contains(u)){
				check = 1;
				break;
			}
			T.add(u);
			if(check == 0)
				System.out.println(u.PrintInfo());
		}
	}
	
	public static void main(String[] args) {
	
		UserAccount UA = CreateAccount();
		/*//test
		System.out.println(UA.PrintInfo());*/
		
		UserAccount UA1 = new UserAccount("Ali" , "Kassem" , "hisPass1");
		UserAccount UA2 = new UserAccount("Mahdi" , "Kotaish" , "hisPass2");
		Receivers.add(UA1);
		Receivers.add(UA2);
		UA.SendMessage("Sent by UserAccount" , Receivers);
		UA.SendMessage("Sent by UserAccount" , Receivers);  //To test Friends
		//testing SendMessage:
		System.out.println(Receivers.get(0).getMailBox().get(0).getBody());
		
		Friends(UA1);  //Must print UA one time only
		
				
		//Testing Emails:
		UserAccount UA3 = new UserAccount("Ali" , "Kassem" , "diffPass");
		System.out.println("Email of UA1 is: \n" + UA1.getEmail() );
		System.out.println("Email of UA3 is: \n" + UA3.getEmail());
		
		
		//TRIAL:
		UserAccount TA = new Trial("Moussa" , "Kassem" , "hisPass3");
		//Trying to send more than 100 messages:
		for(int i=0 ; i<=100 ; i++)
			TA.SendMessage("Sent by Trial", Receivers);
		//100 message must be sent, testing the first one:
		System.out.println(Receivers.get(0).getMailBox().get(2).getBody());
		
		
		//PREMIUM:
		Premium PA = new Premium("Essa" , "Kassem" , "hisPass4");
		PA.blockUserAccount(UA1);
		Receivers.add(TA);
		PA.SendMessage("Sent by Premium", Receivers);
		System.out.println(TA.PrintInfo() + " has received your message: "
				+ "\"" + Receivers.get(2).getMailBox().get(0).getBody() + "\"");
	}
}