import java.util.Scanner;

public class AdvancedTopics {
	public static Scanner in  = new Scanner(System.in);
	public static final int N = 4;
	
	public static String[][] newinfo(String [][] d){
		String [][] nd = new String[d.length][3];
		String [] FL = new String[d.length];
		String s;
		int c;
		for(int i = 0 ; i <d.length; i ++){
			nd[i][0] = d[i][0];
			nd[i][1] = d[i][1];
			s = "" +nd[i][0].charAt(0) + nd[i][1].charAt(0);
			c = 0;
			for(int j = 0; j<i; j++){
				if(s.equals(FL[j])){
					c++;
				}
			}
			FL[i] = s;
			
			if(c != 0)
				s = s + c;
			
			nd[i][2] = s + "@comp.com" ;
		}
		
		
		return nd;
	}
	
	public static String[][] info(String [] e){
		String [][] f = new String[e.length][3];
		String s[] ,  t[];
		for(int i =0 ; i < e.length ; i ++){
			s = e[i].split("@");
			f[i][2] = s[1];
			t =  s[0].split("\\.");
			f[i][0] = t[0];
			f[i][1] = t[1];
		}
		
		return f;
	}
	
	public static boolean isvalidemail(String m){
		String [] s = m.split("@");
		if( !( (s.length == 2) && (s[0] != "") && (s[1] !="")) )
			return false;
		String [] t = s[0].split("\\.");
		if( !( (t.length == 2) && (t[0] != "") && (t[1] !="")) )
			return false;
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] emails = new String[N];
		for(int i=0;i<N; i++){
			do{
			System.out.println("enter email  " + i);
			emails[i] = in.next();
			}while(!isvalidemail(emails[i]));
		}
		System.out.println("---------------");
		System.out.println("First\tLast\tServer");
		System.out.println("-----\t----\t------");
		String [][] details = info(emails);
		for(int i = 0; i<N; i ++){
			System.out.println(details[i][0]+"\t"+details[i][1] +"\t"+details[i][2]);
		}
		
		String [][] newdetails = newinfo(details);
		System.out.println("---------------");
		System.out.println("First\tLast\tNew Email");
		System.out.println("-----\t----\t----------");

		for(int i = 0; i<N; i ++){
			System.out.println(newdetails[i][0]+"\t"+newdetails[i][1] +"\t"+newdetails[i][2]);
		}
		
	}

}
