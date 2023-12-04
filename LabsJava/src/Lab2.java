import java.util.*;

public class Lab2 {
	
	public static Scanner in = new Scanner(System.in);
	
	
	//EX1
	public static int MaxMatrix(int [][] M){
		int max = M[0][0];
		for(int i=0 ; i<M.length ; i++){
			for(int j=0 ; j<M[i].length ; j++){
				if(M[i][j] > max)
					max=M[i][j];
			}
		}
		return max;
	}
	public static void MaxMatrixTest(){
		int M[][] = { {1,2,3} , {-4,0,5} , {6,-8,0} };
		System.out.println("Maximum is: " + MaxMatrix(M));
	}
	
	
	
	//EX2
	public static int RowSum(int [][] M , int x){  //RK: row x corresponds to index x-1
		int s=0;
		if( M.length < x-1 )
			return 0;
		
		for(int i=0 ; i<M[x-1].length ; i++){
			s = s + M[x-1][i];
		}
		return s;
	}
	public static void RowSumTest(){
		int M[][] = { {1,2,3} , {-7,5,4} , {3,4,7} };
		System.out.println("Sum of elemenets of row 2 is: " + RowSum(M,2));
	}
	
	
	
	//EX3
	public static int ColSum(int [][] M , int x){ 
		int s=0;
		for(int i=0 ; i<M.length ; i++){
			for(int j=0 ; j<M[i].length ; j++){
				if(M[i].length < x)  
					break;				//Eza ma 7atayna if...Break kaman true , bedawer
				if(j == x)				//3ala j == x wma bele2eha so byotla3
				s = s + M[i][j];
			}
		}
		
		return s;
	}
	
	public static void ColSumTest(){
		int M[][] = { {1,2,3,4} , {5,6} , {7,8,9} , {10} };
		System.out.println("Sum of elements of column 3 is: " + ColSum(M,3));	
	}
	
	
	/*
	//EX4
	public static int [] AllRowsSum(int [][] M){
		int s[] = new int[M.length];
		for(int i=0 ; i<M.length ; i++){
			for(int j=0 ; j<M[i].length ; j++){
				s[i] = s[i] + M[i][j];
			}
		}
		return s;
	}
	public static void AllRowsSumTest(){
		int M[][] = { {1,2,3,4} , {5,6} , {7,8,9} , {10} };
		for(int i=0 ; i<M.length ; i++){
			System.out.println(s[i] + "\t");
		}
	}
	*/
	
	
	public static void main(String [] args){
		//MaxMatrixTest();
		//RowSumTest();
		//ColSumTest();
		//AllRowsSumTest();
	}
	
}






/*

import java.util.Scanner;

public class L2{
	
	public static Scanner in = new Scanner(System.in);

	public static int[][] Create2D(int r , int c){
		int M[][] = new int[r][];
		for(int i=0 ; i<M.length ; i++){
			M[i] = new int[c]; 
			for(int j=0 ; j<M[i].length ; j++)
			M[i][j] = in.nextInt();
		}
		return M;
	}
	
	public static void Print2D(int M[][]){
		for(int i=0 ; i<M.length ; i++){
			for(int j=0 ; j<M[i].length ; j++){
				System.out.print(M[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	
	//EX1
	public static int Max2D(int M[][]){
		int max = M[0][0];
		for(int i=0 ; i<M.length ; i++){
			for(int j=0 ; j<M[i].length ; j++){
				if(M[i][j]>max)
					max = M[i][j];
			}
		}
		return max;
	}
	public static void Max2DTest(){
		int M[][] = Create2D(2,3);
		System.out.println("Max is: " + Max2D(M));
	}
		
	public static int RowSum(int M[][] , int x){
		x--;	//x>=1 Now x>=0 
		int s=0;
		for(int j=0 ; j<M[x].length ; j++){
				s += M[x][j];
		}
		return s;
	}
	public static void RowSumTest(){
		int M[][] = Create2D(3,2);
		Print2D(M);
		System.out.println(RowSum(M,1));
	}
	
	public static int ColSum(int M[][] , int x){
		x--;	//x>=1 Now x>=0
		int s=0;
		for(int i=0 ; i<M.length ; i++){
			s += M[i][x];
		}
		return s;
	}
	public static void ColSumTest(){
		int M[][] = Create2D(3,2);
		Print2D(M);
		System.out.println(ColSum(M,2));
	}
	
	public static void main(String[] args){
		//Max2DTest();
		//RowSumTest();
		//ColSumTest();
	}
}
*/