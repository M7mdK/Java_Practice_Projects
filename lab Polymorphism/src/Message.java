import java.util.ArrayList;
public class Message {
	private UserAccount Sender;
	private ArrayList<UserAccount> Receivers;
	private String Body;
	
	public Message(UserAccount sender , ArrayList<UserAccount> receivers , String body){
		Sender = sender;
		Receivers = receivers;
		Body = body;
	}
	 
	public String getBody(){
		return Body;
	}
	
	public UserAccount getSender(){
		return Sender;
	}
	
	public ArrayList<UserAccount> getReceivers(){
		return Receivers;
	}
}
