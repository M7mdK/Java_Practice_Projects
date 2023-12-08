package Driver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Individuals.Student;

public class StudentWithBackup {

	public static ArrayList<Student> st = new ArrayList<Student>();
	
	public static void LoadStudents(){
		DataInputStream din;
		String id, name;
		int age;
		int N, counter;
		
		try {
			din = new DataInputStream(new FileInputStream("students.txt"));
			N = din.readInt();
			for(int i = 0; i< N; i ++){
				if(i == 0){
					counter = din.readInt();
					Student.setCounter(counter);
				}
				
				id =  din.readUTF();
				name = din.readUTF();
				age =  din.readInt();
				st.add(new Student(id,name,age));
			}
			din.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void SaveStudents(){
		DataOutputStream dout;
		
		try {
			dout = new DataOutputStream(new FileOutputStream("students.txt"));
			dout.writeInt(st.size());
			if(st.size() >0)
				dout.writeInt(Student.getCounter());
			for(int i = 0; i< st.size(); i ++){
				dout.writeUTF(st.get(i).getID());
				dout.writeUTF(st.get(i).getName());
				dout.writeInt(st.get(i).getAge());
			}
			dout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		DataOutputStream dout;
		try {
			dout = new DataOutputStream(new FileOutputStream("students.txt"));
			dout.writeInt(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Scanner in = new Scanner(System.in);
		boolean repeat = true;
		String name;
		int age;
		int choice;
		
		LoadStudents();
		
		while(repeat){
			System.out.println(" 1 - add student");
			System.out.println(" 2 - print list of students");
			System.out.println(" 3 - remove student ");
			System.out.println(" 4 - exit");
			choice = in.nextInt();
			switch(choice){
			case 1: 
				System.out.println("name ?");
				name = in.next();
				System.out.println("age?");
				age = in.nextInt();
				st.add(new Student(name,age));
				break;
			case 2:
				for(int i =0 ; i< st.size(); i ++)
					System.out.println(st.get(i));
				break;
			case 3:
				st.remove(0);
				break;
			default:
				SaveStudents();
				repeat = false;
				break;
			}
		}
		
		
		
		
	}

}
