import java.util.*;
public class Practice {
	public static Scanner in = new Scanner(System.in);
	
	
	public static int factorial(int n){
		int f=1;
		for(int i=2 ; i<=n ; i++){
			f*=i;
		}
		return f;
	}
	public static void factorialTest(){
		System.out.println("factorial of 5 is: " + factorial(5));
	}
	
	
	
	
	
	
	//Array:
	public static void PrintArray(int A[]){
		for(int i=0 ; i<A.length ; i++){
			System.out.print(A[i] + "\t");
		}
		System.out.println();
	}
	
	
	//Function ReadArray using 2 methods:
	//1st Method:
	public static void ReadArray1(int []A){
		for(int i=0 ; i<A.length ; i++){
			A[i] = in.nextInt();
		}
	}
	public static void ReadArray1Test(){
		int A[] = new int[5];
		ReadArray1(A);
		PrintArray(A);
	}
	
	
	//2nd Method:
	public static int [] ReadArray2(int n){
		int A[] = new int[n];
		for(int i=0 ; i<A.length ; i++){
			A[i] = in.nextInt();
		}
		return A;
	}
	public static void ReadArray2Test(){
		int B[] = ReadArray2(5);
		PrintArray(B);
	}
	
	
	
	public static int [] Sum2Arrays(int A[] , int B[]){
		int S[] = new int[A.length];
		if(A.length != B.length){
			System.out.print("Different lengths , can't add");
			return null;
		}
		for(int i=0 ; i<A.length ; i++){
			S[i] = A[i] + B[i];
		}
		return S;
	}
	public static void Sum2ArraysTest(){
		int A[] ={1,2,3,4,5};
		int B[] ={2,4,9,6,7};
		int C[] ={3,5,7};
		int S[] = Sum2Arrays(A,B);
		System.out.println("Result of addition of A and B:");
		PrintArray(S);
		Sum2Arrays(A,C);
		System.out.println(" A and C");	
	}
	
	
	
	
	
	
	//Matrix:
	public static void PrintMatrix(int M[][]){
		for(int i=0 ; i<M.length ; i++){
			for(int j=0 ; j<M[i].length ;j++){
				System.out.print(M[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	//Function ReadMatrix using 2 methods
	//1st Method:
	public static void ReadMatrix1(int M[][]){
		for(int i=0 ; i<M.length ; i++){
			for(int j=0 ; j<M[i].length ; j++){
				M[i][j] = in.nextInt();
			}
		}
	}
	public static void ReadMatrix1Test(){
		int M[][] = new int[3][2];
		ReadMatrix1(M);
		PrintMatrix(M);
	}
	
	
	//2nd Method:
	public static int [][] ReadMatrix2(int r , int c){
		int M[][] = new int[r][c];
		for(int i=0 ; i<r ; i++){
			for(int j=0 ; j<c ; j++){
				M[i][j] = in.nextInt();
			}
		}
		 					/*OR:
		 					int M[][];
		 					M = new int[r][];
		 					for(int i=0 ; i<r ; i++){
		 						M[i] = new int[c];
		 						for(int j=0 ; j<c ; j++){
		 						M[i][j] = in.nextInt();
		 						}
		 					}
		 					 */
		return M;
	}
	public static void ReadMatrix2Test(){
		int M[][] = ReadMatrix2(2,3); //3x4 Matrix
		PrintMatrix(M);
	}
	
	
	
	public static int [][] Sum2Matrices(int M[][] , int N[][]){
		int S[][] = new int[M.length][M[0].length];
		if(M.length != N.length  ||  M[0].length != N[0].length){   //Taking case of matrix only
			System.out.print("Different sizes , can't add");		//not a general 2D-Array
			return null;												//All cols are of same size
		}
		for(int i=0 ; i<M.length ; i++){
			for(int j=0 ; j<M[i].length ; j++){
				S[i][j] = M[i][j] + N[i][j];
			}
		}
		return S;
	}
	public static void Sum2MatricesTest(){
		int M[][]={{1,2,3},{4,5,6}};
		int N[][]={{3,5,3},{1,5,7}};
		int Q[][]={{1,2},{3,4},{5,6}};
		int S[][] = Sum2Matrices(M,N);
		System.out.println("Result of addition of M and N :");
		PrintMatrix(S);
		Sum2Matrices(M,Q);
		System.out.print(" M and Q");
		
		
	}
	
	
	
	
	
	
	
	//Strings:
	
	
	
	

	public static void main(String[] args){
		
		//factorialTest();
		
		//ReadArray1Test();
		//ReadArray2Test();
		//Sum2ArraysTest();
		
		//ReadMatrix1Test();
		//ReadMatrix2Test();
		//Sum2MatricesTest();
	
		
		System.out.println(in.nextInt());
		
		
		
	}
}	