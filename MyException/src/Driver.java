import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Driver {
	
	public static void f(int a) throws MyException{
		if(a>10){
			a = a/(a-11);
			throw new MyException();
		}
		else{
			System.out.println("hi");
			
		}
	}
	public static void main(String [] s){
	/*	Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		
			try {
				if(a>10)
					throw new MyException();
				else
					System.out.println("Hi");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println("Hello");
			}
			*/
		try{
			f(20);
		}
		catch(MyException e){
			System.out.println(e.f());
		}
		
		/*for(int i = 0; i < 12; i ++){
			try {
				new A();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println("hi");
			}
		}*/
		
	}
}
