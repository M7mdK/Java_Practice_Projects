package Individuals;

public class Person {
	protected String  Name;
	//protected int Age;
	protected MyDate BirthDay;
	
	public String getName(){
		return Name;
	}
	
	public int getAge(){
		return BirthDay.Age();
	}
	
	public Person(String name, String b){
		Name =  name;
		BirthDay = new MyDate(b);
	}
	
	public String toString(){
		return "Name : " + Name + " - " + "Age :" + getAge();
	}
}
