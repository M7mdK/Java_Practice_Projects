package CourseManagement;

import java.util.ArrayList;

import Individuals.Instructor;
import Individuals.Student;

public class Course {
	private String Code;
	private String Name;
	private Instructor Teacher = null;
	private ArrayList<Student> st;
	
	public Course(String code, String name){
		Code = code;
		Name = name;
		st =  new ArrayList<Student>();
	}
	
	public Course (String code, String name, Instructor teacher){
		this(code, name);
		this.setTeacher(teacher);
	}
	
	public String getCode(){
		return Code;
	}
	
	public String getName(){
		return Name;
	}
	
	public ArrayList<Student> getSt(){
		return st;
	}
	
	public void setTeacher(Instructor t){
		Teacher = t;
		Teacher.getLTC().add(this);
	
	}
	
	public Instructor getTeacher(){
		return Teacher;
	}
	
	public String toString(){
		return "Code : " + Code + "\nName : " + Name;
	}
}
