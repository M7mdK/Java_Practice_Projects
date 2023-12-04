import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Pract{

    public static int mySum(int x , int y){
        int sum = x+y;
        return sum;
    }

    public int avg(int x , int y , int n){
        return mySum(x,y) / n;
    }

    public static void ft(String name){
        if(name.equals("Guest")){
            return;
        }
        System.out.print("hi " + name);
    }

    public static void ft(){
        System.out.print("hi ");

    }

    public static int ft1(int x , int y){
        return x*y;
    }



    public static void main(String[] args) {

        //String s1 = "Hello";
        //String s2 = "World";
        //String s3 = s1 + " " + s2;
/*
        int x;  //define
        int y = -3;
        int z = -1;

        x = 5; //initialize


        char c = 'a';
        String s1 = "hello";
        String s2 = "3";

        boolean b1 = true;
        boolean b2 = false;*/

        //System.out.println(x + y);  //8
        //System.out.print(s1 + s2);  //53



/*
        int x = -2;

        if(x == 0){
            System.out.print("1");
        }
        else if(x == 1){
            System.out.print("2");
        }
        else if(x == 2){
            System.out.print("3");
        }
        else if(x > 2){
            System.out.print("4");
        }
        else if(x == -1){
            System.out.print("5");
        }
        else{           //x < -1
            System.out.print("6");
        }

        int y = 3;

        if(y > 1){
            System.out.print("H1");
        }
        if(y > 0){
            System.out.print("H2");
        }
        else if(y == -5){
            System.out.print("EF1");
        }
        else{
            System.out.print("E2");
        }
        if(y > 2){
            System.out.print("H3");
        }
        if(y > 3){
            System.out.print("H4");
        }
        else{
            System.out.print("E1");
        }
*/






        //T and C and (L or M)
        //O or A or B or Anythings
/*
        char veg = 'v';
        char fruits = 'A';

        if(veg == 'T'){
            System.out.print("T");
        }
        if(veg == 'C'){
            System.out.print("C");
        }
        if(veg == 'L'){
            System.out.print("L");
        }
        else if(veg == 'M'){
            System.out.print("M");
        }

        if(fruits == 'O'){
            System.out.print("O");
        }
        else if(fruits == 'A'){
            System.out.print("A");
        }
        else if(fruits == 'B'){
            System.out.print("B");
        }
        else{
            System.out.print("Any Fruit");
        }
*/
/*
        //Nested if
        int x=2;
        if(x > 0){
            System.out.print("Yes x is positive");
            if(x == 1){
                System.out.print("Yes x is 1");
            }
            else{
                System.out.print("No x is not 1");
            }
        }
        else{
            System.out.print("No x is not positive");
        }*/

        int sum = 0;

        for(int i=1 ; i <= 3  ; i++){
            sum = sum + i;
        }

        System.out.print(sum);



        /*
        int i = 0;
        while(i < 5){
            System.out.print(i);
            i++;
        }
        */






















        /*
        int color = 6;
        int price;

        if(color == 1){
            price = 30;
        }
        else if(color == 2){
            price = 35;
        }
        else{
            price = 25;
        }

        System.out.print(price);
*/




















        /*static int x;
    static double z;
    double y = 9.7;
    char c = 'a';
    String s1 = "acb";*/

        //Default: int=0 , double=0.0 , String=null , boolean=false

        //static String s4;


















        /*int a[] = {2,4,6,3,1};
        int b[][] = { {1,2,3} , {4,5,6} };
        int c[][][] = { { {1,2,3} , {4,5,6} , {7,8,9} , {11,12,13} } ,
                { {14,15,16} , {14,15,16} , {14,15,16} , {34,35,36} } };
        //int c[][][] = new int[2][4][3];

        for(int i=0 ; i < b.length ; i++){
            for(int j=0 ; i < b[i].length ; j++){
                System.out.print(b[i][j]);
            }
        }

        for(int i=0 ; i < c.length ; i++){

            for(int j=0 ; i < c[i].length ; j++){

                for(int k=0 ; k<c[i][j].length ; k++){
                    System.out.print(c[i][j][k]);
                }
            }
        }*/







        /*String s1 = ""; //empty string
        String s2 = null;
        String s3;*/

        //int x = 0;

        /*if(x > 0){
            System.out.print("A");
        }
        else if(x == 0) {
            System.out.print("B");
        }
        else if(x < 0){
            System.out.print("C");
        }*/

        /*for(int i=0 ; i<10 ; i++){

            if(i == 7){
                break;
            }
            System.out.println(i);
        }*/

        /*int A[] = new int[5];

        for(int i=0 ; i<A.length ; i++){
            A[i] = i+1;
        }

        int B[] = {1,2,3,4,5};

        int M[][] = new int[2][3];*/

        /*for(int i=0 ; i<4 ; i++){
            System.out.println(i);  //0123
            for(int j=0 ; j<5 ; j++){
                System.out.println(i);  //00000 11111 22222 33333
                System.out.println(j);  //01234 01234 01234 01234
            }
        }*/

        /*for(int i=0 ; i<M.length ; i++){
            for(int j=0 ; j<M[i].length ; j++){
                M[i][j] = 7;
            }
        }*/

        /*
        M[i][j][k]
        2x3x4

        M[0][0][0]
        M[0][0][1]
        M[0][0][2]
        M[0][0][3]

        M[0][1][0]
        M[0][1][1]
        M[0][1][2]
        M[0][1][3]

        M[0][2][0]
        M[0][2][1]
        M[0][2][2]
        M[0][2][3]

        M[1][0][0]
        M[1][0][1]
        M[1][0][2]
        M[1][0][3]

        M[1][1][0]
        M[1][1][1]
        M[1][1][2]
        M[1][1][3]

        M[1][2][0]
        M[1][2][1]
        M[1][2][2]
        M[1][2][3]
                */


        /*
        M[0][0] = 0;
        M[0][1] = 1;
        M[0][2] = 2;

        M[1][0] = 1;
        M[1][1] = 2;
        M[1][2] = 3;
        */

        //String Ar[] = new String[5];

        /*ArrayList<Integer> L = new ArrayList<Integer>();

        L.add(1);
        L.add(-2);
        L.add(0);
        L.add(7);
        L.add(4);

        System.out.println(L);
        Collections.sort(L);
        System.out.println(L);*/

        /*for(int i=1 ; i<=5 ; i++){
            L.add(i);
        }*/
        /*for(int x : L) {
            System.out.println(x);
        }*/


        /*int sum=0;
        for(int i=0 ; i<L.size() ; i++){
            sum = sum + L.get(i);
        }

        System.out.println(sum);*/

        //HashMap<String , Integer> H = new HashMap<String , Integer>();

        //HashMap<Integer , String> Hm = new HashMap<Integer , String>();

        /*H.put("Messi" , 10);
        H.put("Cr" , 7);
        H.put("Nymar" , 11);*/

        /*H.forEach( (k,v) -> {
            System.out.println(k + " = " + v);
        });*/

        /*H.remove("Cr");
        System.out.print(H);*/

    }

}



