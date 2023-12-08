package session_2017;

public class User {

	public String name;
	public String position;
	public String faculty;
	public boolean decision;
	
	public User(String n,String p,String f, boolean d){
		name=n;
		position=p;
		faculty=f;
		decision=d;
	}
	public String getPosition() {
		return position;
	}
	public boolean getDecision() {
		return decision;
	}
	public String toString() {
		return "MY name is " +name+"\n"+"MY Position "+position+"\n"+"Faculty "+faculty+"\n"+"The decision is "+decision;
	}
}
