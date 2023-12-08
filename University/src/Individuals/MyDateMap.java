package Individuals;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MyDateMap {
	static ArrayList<MyDate> dd = new ArrayList<MyDate>();
	static Scanner in = new Scanner(System.in);

	public static void print(){
		for(int i=0 ; i < dd.size(); i++)
			System.out.println(dd.get(i));
	}
	
	public static void save(){
		try {
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("date.txt"));
			dout.writeInt(dd.size());
			for(int i=0 ; i < dd.size(); i++){
				dout.writeInt(dd.get(i).getD());
				dout.writeInt(dd.get(i).getM());
				dout.writeInt(dd.get(i).getY());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void load(){
		try {
			DataInputStream din = new DataInputStream(new FileInputStream("date.txt"));
			int n, d, m ,y;
			n = din.readInt();
			for(int i=0; i<n; i++){
				d = din.readInt();
				m = din.readInt();
				y = din.readInt();
				
				String s = d+"/"+m+"/"+y;
				dd.add(new MyDate(s));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String [] a){
		load();
		dd.add(new MyDate("1/4/1999"));
		print();
		save();
		//System.out.println("done");
	}
}
