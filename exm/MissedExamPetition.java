package session_2017;

public class MissedExamPetition extends Petition {
	
	public User instructor;
	public String examDate;
	
	public MissedExamPetition(String t,int pn, String inN,int stid,String cC,String r,User chp,User d,User in, String eD){
		super(t,pn,inN,stid,cC,r,chp,d);
		instructor=in;
		examDate=eD;
	}
	public boolean getFinalApproval() {
		return instructor.getDecision() && super.getchairperson().getDecision() && super.getdear().getDecision();
	}

	public String toString() {
		return "The Missed exam approve is "+getFinalApproval();
	}
}
