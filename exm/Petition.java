package session_2017;

public abstract class Petition {

	public String type;
	public int pnumber;
	public String instructorName;
	public int studentID;
	public String courseCode;
	public String reason;;
	public User chairperson;
	public User dear;
	
	Petition(String t,int pn, String inN,int stid,String cC,String r,User chp,User d){
		type=t;
		pnumber=pn;
		instructorName=inN;
		studentID=stid;
		courseCode=cC;
		reason=r;
		chairperson=chp;
		dear=d;
	}
	public abstract boolean getFinalApproval();
	public User getchairperson() {
		return chairperson;
	}
	public User getdear() {
		return dear;
	}
	public String toString() {
		return "The"+chairperson+"  "+dear+"  approve"+getFinalApproval();
		
	}
}
