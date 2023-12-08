package main_test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import session_2017.ChangeOfGradePetition;
import session_2017.MissedExamPetition;
import session_2017.User;



public class Main {

	public static void store(ChangeOfGradePetition X) {
		try {
			DataOutputStream dout=new DataOutputStream(new FileOutputStream("COGPetition.txt"));
			dout.writeUTF(X.type);
			dout.writeInt(X.pnumber);
			dout.writeUTF(X.instructorName);
			dout.writeInt(X.studentID);
			dout.writeUTF(X.courseCode);
			dout.writeUTF(X.reason);
			dout.writeUTF("chairperson");
			dout.writeUTF(X.chairperson.name);
			dout.writeUTF(X.chairperson.position);
			dout.writeUTF(X.chairperson.faculty);
			dout.writeBoolean(X.chairperson.decision);
			dout.writeUTF("dear");
			dout.writeUTF(X.dear.name);
			dout.writeUTF(X.dear.position);
			dout.writeUTF(X.dear.faculty);
			dout.writeBoolean(X.dear.decision);
			dout.writeDouble(X.oldGrade);
			dout.writeDouble(X.newGrade);
			dout.close();
		}
		catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	
	public static ChangeOfGradePetition View() {
		String t;
		int pn;
		String inN;
		int stid;
		String cC;
		String r;
		String name;
	    String position;
		String faculty;
		boolean decision;
		double x;
		double y;
		String s;
		User dr;
		User ch;
		ChangeOfGradePetition result=null;
		try {
			
			DataInputStream din =new DataInputStream(new FileInputStream("COGPetition.txt"));
			t=din.readUTF();
			pn=din.readInt();
			inN=din.readUTF();
			stid=din.readInt();
			cC=din.readUTF();
			r=din.readUTF();
			s=din.readUTF();
			System.out.println(s);
			name=din.readUTF();
			position=din.readUTF();
			faculty=din.readUTF();
			decision=din.readBoolean();
			ch=new User(name,position,faculty,decision);
			s=din.readUTF();
			System.out.println(s);
			name=din.readUTF();
			position=din.readUTF();
			faculty=din.readUTF();
			decision=din.readBoolean();
		    dr=new User(name,position,faculty,decision);
			x=din.readDouble();
		    y=din.readDouble();	
		    result= new ChangeOfGradePetition (t,pn,inN,stid,cC,r,ch,dr,x,y);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) {
		
		
		ChangeOfGradePetition P;
		User I=new User("ihab","java_teacher","science",false);
		User D=new User("dbouk","section_manager","science",true);
		User B=new User("bassim","faculty_majanger","science",true);
		//P=new ChangeOfGradePetition("changegrade",1,"ihab",86935,"I2211","error in exam",B,D,30,60);
		MissedExamPetition E=new MissedExamPetition("changegrade",1,"ihab",86935,"I2211","sick",B,D,I,"1/8/2019");
	    //store(P);
		P=View();
		System.out.println(P.getFinalApproval());
	}

	
	
	
	
}