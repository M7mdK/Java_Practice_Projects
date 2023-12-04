
public class Teacher extends Employee implements Taxable  {
	
	private int hours;
	private static double totalSalary;
	
	public Teacher(String name , int rank , String major , String degree , int h){
		super(name , rank , major , degree);
		hours = h;
		totalSalary += calculateSalary();
	}
	
	public double getTotalSalary(){
		return totalSalary;
	}
	
	public String toString(){
		String S = super.toString() + " , Hours = " + hours + " , Salary = " + calculateSalary() + ".";
		return S;
	}
	
	public double monthlyTaxAmount(){
		return calculateSalary()*0.7;
	}
	
	public double totalTaxAmount(int nbMonths){
		return monthlyTaxAmount()*nbMonths;
	}
	
	public double calculateSalary(){
		double salary;
		switch(getRank()){
			case 1: salary = hours*75000;
					break;
			case 2: salary = hours*50000;
					break;
			case 3: salary = hours*40000;
					break;
			default: salary = -1;
		}
		return salary;
	}
}
