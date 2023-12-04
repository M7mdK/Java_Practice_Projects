
public class Product {

	private String barcode;
	private String name;
	private int type;
	private String tradeMark;
	
	public Product(String bc , String Name , int Type , String TM){
		
		name = Name;
		type = Type;
		tradeMark = TM;
		barcode = setBarCode(bc);
	}
	
	public String setBarCode(String data){
		
		if(data.length() >10){
			System.out.println("BarCode of " + name + " was set to null , re-enter a valid one");
			return null;
		}
		String s = "";
		int i;
		char A[];
		
		if(data.length() == 10)
			 A = data.toCharArray();
		else{
			char[] a = data.toCharArray();
			A  = new char[10];
			for(i=0 ; i<a.length ; i++)
				A[i] = a[i];
			for(i=a.length ; i<10 ; i++)
				A[i] = '0';
		}
		
		for(i =0 ; i<3 ; i++)
			s = s+A[i];
		s = s + "-";
		for(i=3 ; i<5 ; i++)
			s =s +A[i];
		s =s + "-";
		for(i=5 ; i<10 ;i++)
			s=s+A[i];

		return s;
	}
	
	public boolean sameMark(Product prd){
		if(this.tradeMark.equals(prd.tradeMark))return true;
		else return false;
	}
	
	public String toString(){
		String t;
		if(type == 1)t = "food";
		else if(type == 2) t = "sanitary";
		else t = "special";
		return "\"" + name + "\"" + " has an ISBN " + barcode + " is a " + t + " product";
	}
	
	
	public String getBarcode(){
		return barcode;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String nm){
		name = nm;
	}
	
	public int getType(){
		return type;
	}
	public void setType(int t){
		type = t;
	}
	
	public String getTradeMark(){
		return tradeMark;
	}
	public void setTradeMark(String tm){
		tradeMark = tm;
	}
}
