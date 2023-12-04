
public class Driver {
	
	public static void displayMaximum(Teacher[] T){
		double max = T[0].calculateSalary();
		int j=0;
		for(int i=0 ; i<T.length ; i++){
			if(T[i].calculateSalary() > max){
				max = T[i].calculateSalary();
				j=i;
			}
		}
		System.out.println(T[j].toString());
	}
	
	public static void main(String[] args) {
		
		Teacher T[] = new Teacher[3];
		T[0] = new Teacher("Ali" , 1 , "Math" , "PhD" , 50);
		T[1] = new Teacher("Moussa" , 3 , "Phy" , "MS" , 20);
		T[2] = new Teacher("M7md" , 2 , "CS" , "PhD" , 35);
		
		for(int i=0 ; i<T.length ; i++){
			System.out.println(	T[i].toString());
		}
	
		System.out.println(T[0].getTotalSalary());
		
		displayMaximum(T);
	}

}
