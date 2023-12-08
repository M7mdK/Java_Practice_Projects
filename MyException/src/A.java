
public class A {
	public static int c = 0;

	public A() throws MyException{
		if(c >=10)
			throw new MyException();
		System.out.println("hello");
		c++;
	}
}
