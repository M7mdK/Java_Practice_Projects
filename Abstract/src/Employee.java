
public class Employee{
	protected int id=1000;
	protected String name;
	protected Certificate diploma;
	protected int rank=0;
	
	protected static int c=0;
	
	public Employee(String Name ,  int Rank ,String major , String degree){
		id = id + c;
		c++;
		name = Name;
		diploma = new Certificate(major , degree);
		if(Rank == 1 || Rank == 2 || Rank == 3)
			rank = Rank;
	}
	
	int getRank(){
		return rank;
	}
	
	public String toString(){
		String S = id + "  " + name + " holding a " + diploma.getDegree() +
			    	" in " + diploma.getMajor() + " , and has rank " + rank;
	    return S;
	}
}