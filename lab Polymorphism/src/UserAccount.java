import java.util.ArrayList;
public class UserAccount {
	protected String FName,  LName , Email , Password;
	protected ArrayList<Message> MailBox =  new ArrayList<Message>();
	
	protected static ArrayList<UserAccount> AllUsers = new ArrayList<UserAccount>();
	
	public UserAccount(String fn , String ln , String pass){
		int count = 0;
		FName = fn;
		LName = ln;
		Password = pass;
		Email = fn + "." + ln + "@" + "mailbox.com";
		for(int i=0 ; i<AllUsers.size() ; i++){
			if(FName.equals(AllUsers.get(i).FName)  && LName.equals(AllUsers.get(i).LName))
				count++;
		}
		if(count>0)
			Email = fn + "." + ln + count + "@" + "mailbox.com";
		AllUsers.add(this);
	}
	
	public Message SendMessage(String text , ArrayList<UserAccount> receivers){
		Message m = new Message(this , receivers , text);
		for(int i=0 ; i<receivers.size() ; i++)
			receivers.get(i).getMailBox().add(m);
		return m;
	}
	
	public String ReadMessage(int i){
		return MailBox.get(i).getBody();
	}
	
	public String PrintInfo(){
		return FName + " " + LName;
	}
	
	public ArrayList<Message> getMailBox(){
		return MailBox;
	}
	
	public String getEmail(){
		return Email;
	}
}
