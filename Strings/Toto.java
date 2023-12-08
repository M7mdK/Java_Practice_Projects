import java.util.Scanner;

public class Toto {
	public static Scanner in = new Scanner(System.in);
	
	public static void Sort(String [] s){
		int m = s.length;
		String t;
		for(int pass = 0 ; pass < m ; pass ++){
			for(int i = 0 ; i < m -1 ; i ++){
				if(s[i].compareTo(s[i+1]) > 0 ){
					t = s[i];
					s[i] = s[i+1];
					s[i+1] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		String s = new String("abc");
		String [] w;
		int n;
		System.out.println("how many words?");
		n = in.nextInt();
		w = new String[n];
		for(int i= 0; i<n;i++){
			System.out.println("enter the word " + i);
			w[i] = in.next();
		}
		
		 Sort(w);

		for(int i= 0; i<n;i++){
			System.out.println(w[i]);
		}
		*/
		
		//System.out.println(s.charAt(6));
		char [] c;
		c = s.toCharArray();
		System.out.println(c.length);
		
	}
}
