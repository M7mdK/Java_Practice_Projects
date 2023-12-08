package Individuals;

import java.sql.Date;
import java.util.Calendar;
import java.util.Stack;

public class MyDate {
	private int y, m, d;
	
	public MyDate(String t){
		String x [] = t.split("/");
		d = Integer.parseInt(x[0]);
		m = Integer.parseInt(x[1]);
		y = Integer.parseInt(x[2]);
	}
	
	public int getY(){
		return y;
	}
	public int getM(){
		return m;
	}
	public int getD(){
		return d;
	}
	public int Age(){
		int a = 0;
		//calculate a
		return a;
		
	}
	public String toString(){
		return d+"-"+m+"-"+y;
	}
}
