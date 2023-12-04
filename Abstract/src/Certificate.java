
public class Certificate {
	private String major;
	private String degree;
	
	public Certificate(String m , String d){
		major = m;
		degree = d;
	}
	
	String getMajor(){
		return major;
	}
	String getDegree(){
		return degree;
	}
	
	public String toString(){
		String S = "Major :" +  major + " , Degree :" + degree;
		return S;
	}
}
