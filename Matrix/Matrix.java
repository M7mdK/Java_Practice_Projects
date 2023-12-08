import java.util.Scanner;

public class Matrix {

	public static Scanner in = new Scanner(System.in);
	
	public static int [][] readMatrix( int r, int c){
		int Mat[][];
		Mat = new int[r][];
		for(int i = 0; i < r; i++){
			Mat[i] = new int[c];
			System.out.println("elements of row " + i);
			for(int j = 0; j < c; j++)
				Mat[i][j] = in.nextInt();
 			
		}
		return Mat;
	}
	public static void printMatrix(int Mat[][]){
		for(int i=0; i < Mat.length ; i ++){ //Row length         
			for(int j = 0; j < Mat[i].length; j ++)//col len
				System.out.print(Mat[i][j] + " ");
			System.out.println();
		}
	}
	public static int [] sumArrays(int X[], int Y[]){
		int Z[];
		Z = new int[X.length];
		for(int i = 0; i < Z.length; i++)
			Z[i] = X[i] + Y[i];
		return Z;
	}
	
	public static int [][] sumMatrix(int M1[][], int M2[][]){
		int S[][];
		
		if(! ((M1.length == M2.length) && (M1[0].length == M2[0].length))){
			return null;
		}
		S =  new int[M1.length][];
		for(int i = 0; i < S.length; i++){
			/*S[i] = new int[M1[0].length];
			for(int j = 0; j < S[i].length; j++)
				S[i][j] = M1[i][j] + M2[i][j];
			*/
			S[i] = sumArrays(M1[i],M2[i]);
	//we use sumArray or hodi lbel comment fo2
		}
		
		return S;
	}
	
	public static void main(String[] args) {
		int NA, MA,NB,MB;
		int A[][];
		int B[][];
		int C[][];
		System.out.println("enter the dimensions of A");
		NA = in.nextInt();
		MA = in.nextInt();
		A = readMatrix(NA,MA);
		System.out.println("enter the dimensions of B");
		NB = in.nextInt();
		MB = in.nextInt();
		B = readMatrix(NB,MB);
		
		C = sumMatrix(A,B);
		if(C == null)
			System.out.println("error");
		else
			printMatrix(C);
	}

}
