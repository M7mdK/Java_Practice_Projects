package session_2017;

public class ChangeOfGradePetition extends Petition {

	public double oldGrade;
	public double newGrade;
	
	public ChangeOfGradePetition(String t,int pn, String inN,int stid,String cC,String r,User chp,User d,double og,double ng){
		super(t,pn,inN,stid,cC,r,chp,d);
		oldGrade=og;
		newGrade=ng;
	}
	public boolean getFinalApproval() {
		return super.getchairperson().getDecision() && super.getdear().getDecision();
	}
	public String toString() {
		return "The Change Grade approve is "+getFinalApproval();
	}
}
