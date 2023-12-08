package Driver;

import java.util.ArrayList;
import java.util.Scanner;

import Individuals.*;

public class DriverPolymorpisme {

/*	public static void SortByName(Person p[]){
		int N = p.length;
		int i, j;
		Person t;
		
		for(i=0; i < N- 1 ; i ++){
			for(j= 0 ; j < N - 1 ; j ++){
				if(p[j].getName().compareTo(p[j+1].getName()) > 0){
					t = p[j];
					p[j] = p[j+1];
					p[j+1] = t;
				}
			}
		}
			
	}
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person s =  new Student("abc", 22);
		
		
		
		if( s instanceof Instructor){
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
/*		Person p;
		Student s [] =  new Student[3];
		s[0] = new Student("MNO",2);
		s[1] =  new Student("XYZ",44);
		s[2] = new Student ("ABC", 33);
		
		SortByName(s);
		
		for(int i = 0 ; i < s.length; i ++)
			System.out.println(s[i]);
	*/
		
	/*ArrayList<Person> p = new ArrayList<Person>();
	Scanner in = new Scanner (System.in);
	boolean repeat =  true;
	String name;
	int age;
	int choice;
	while(repeat){
		System.out.println("name:");
		name = in.next();
		System.out.println("age:");
		age = in.nextInt();
		System.out.println("Student ==>0 , Instructor ==>1 ?" );
		choice = in.nextInt();
		
		switch(choice){
		case 0 : p.add(new Student(name,age));
		break;
		default: p.add(new Instructor(name, age));
		break;
		}
		
		
		System.out.println("repeat? (true/false) ");
		repeat = in.nextBoolean();
	}
	
	
	
	System.out.println(" ---------------------------- ");
	for(int i= 0 ; i <p.size(); i ++)
		System.out.println(p.get(i));
	*/
	
	
	
	
	
	
		
		
		
		
	}

}
