import java.util.*;

public class Lab1 {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void printArray(int A[]){
		for(int i=0 ; i<A.length ; i++){
			System.out.print(A[i] + "\t");
		}
	}
	
	
	//EX1
	public static void CumSum(int A[] , int S[] , int N){
		S[0]=A[0];
		for(int i=1 ; i<N ; i++){
			S[i]=S[i-1]+A[i];
		}
	}
	public static void CumSumTest(){
		int A[]={2,-1,1,4,-3};
		int S[] = new int[5];
		CumSum(A,S,5);
		printArray(S);
	}
	
	
	
	
	//EX2
	public static int MaxArray(int A[] , int N){
		int max=A[0];
		for(int i=0 ; i<N ; i++)
			if(A[i]>max){
			max=A[i];	
			}
		return max;
	}
	public static void MaxArrayTest(){
		int A[]={2,-1,1,4,-3};
		System.out.print(MaxArray(A,5));
	}
	
	
	
	//EX3
	public static boolean CheckElem(int A[] , int N , int v){
		for(int i=0 ; i<N ; i++)
			if(A[i]==v)
				return true;
		
		return false;
	}
	public static void CheckElemTest(){
		int A[]={2,-1,1,4,-3};
		if(CheckElem(A,5,1) && !CheckElem(A,5,6))
			System.out.print("1 appears in A and 6 doesn't appear");
	}
	
	
	
	
	//EX4
	public static int [] ReadArray10(){
		
		System.out.println("Enter size of the array");
		int size = in.nextInt();
		int A[] = new int[size];
		
		System.out.println("Enter elements of the array of values between [-10,10]");
		for(int i=0 ; i<size ; i++){
			A[i] = in.nextInt();
			while(A[i]<-10 || A[i]>10){
				System.out.println("Re-Enter A[" + i + "]");
				A[i] = in.nextInt();
			}
				
		}
		return A;
	}
	public static void ReadArray10Test(){
		int B[] = ReadArray10();
		printArray(B);
	}
	
	
	
	
	//EX5
	public static boolean isSpecial(int A[]){
		int S[] = new int[A.length];
		CumSum(A,S,A.length);
		if(  CheckElem( A , A.length , MaxArray(S,S.length) )  ){
			return true;
		}
		return false;
		
	}
	public static void isSpecialTest(){
		int A[] = ReadArray10();
		if(isSpecial(A)){
			System.out.println("A is special");
		}
		else{
			System.out.println("A is NOT special");
		}
	}
	
	
	public static void main(String[] args) {
		
		//CumSumTest();
		//MaxArrayTest();
		//CheckElemTest();
		//ReadArray10Test();
		//isSpecialTest();
	}

}
