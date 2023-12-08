package Driver;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main (String [] x){
		Scanner in = new Scanner(System.in);
		int a [] =  new int [10];
		int b, c, i;
		try{
			b = in.nextInt();
			c = in.nextInt();
			i = in.nextInt();
			a[i] = b / c;
		}
		catch(ArithmeticException e){
			System.out.println("hiiii");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("bye");
		
		in.close();
		
	}

}
