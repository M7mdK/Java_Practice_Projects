import java.util.ArrayList;

public class Premium extends UserAccount{
	
	private ArrayList<UserAccount> BlackList = new ArrayList<UserAccount>();
	
	public Premium(String fn , String ln , String pass){
		super(fn,ln,pass);
	}
	
	public void blockUserAccount(UserAccount B){
		BlackList.add(B);
	}
	
	public Message SendMessage(String text , ArrayList<UserAccount> receivers){
		Message m = new Message(this , receivers , text);
		for(int i=0 ; i<receivers.size() ; i++){
			if(BlackList.contains(receivers.get(i)) == false)  //Not blocked
				receivers.get(i).getMailBox().add(m);
			else{  //blocked
				System.out.println(receivers.get(i).PrintInfo() + 
						" was blocked by you, he can't receive your message");
			}
		}
		return m;
	}
}
