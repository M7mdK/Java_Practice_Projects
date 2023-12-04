import java.util.ArrayList;

public class Student extends Person {
	private String ID;
	private static int c = 1000;
	private ArrayList<Course> ListOfRegisteredCourses;
	
	
	public Student(String name, String birth){
		super(name, birth);
		ID = "" + Name.charAt(0) + c;
		c ++;
		ListOfRegisteredCourses = new ArrayList<Course>();
	}
	
	public Student(String id, String name, String birth){
		super(name, birth);
		ID = id;
		ListOfRegisteredCourses = new ArrayList<Course>();
	}
	
	public String getID(){
		return ID;
	}
	
	public ArrayList<Course> getLRC(){
		return ListOfRegisteredCourses;
	}
	
	public static int getCounter(){
		return c;
	}
	
	public static void setCounter(int c1){
		c = c1;
	}
	
	public void registerTo(Course c){
		this.ListOfRegisteredCourses.add(c);
		c.getSt().add(this);
	}
	
	public String toString(){
		return "ID: " + ID + " - " + super.toString();
	}
}
