import java.util.ArrayList;

public class Trial extends UserAccount{
	private int c=0;
	
	public Trial(String fn , String ln , String pass){
		super(fn , ln , pass);
	}
	
	public Message SendMessage(String text , ArrayList<UserAccount> receivers){
		if(c<100){
			c++;
			return super.SendMessage(text, receivers);
		}
		else{
			System.out.println("Trial version is limited for 100 messages."
					+ " \n Buy the premium version for more!");
			return null;
		}
	}
}
