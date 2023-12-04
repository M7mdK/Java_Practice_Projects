import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class DataStructures {

    /*public boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;
        
        Stack<Character> stack = new Stack();
        
        for(int i=0 ; i<s.length() ; i++){
            
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                
            }
                
            else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                
                if(stack.isEmpty())
                    return false;
                char c = stack.peek();
                
                if((c == '(' && s.charAt(i) == ')') ||
                  (c == '[' && s.charAt(i) == ']') ||
                   (c == '{' && s.charAt(i) == '}')){
                    
                     stack.pop();
                }
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }*/

    //public static void main(String args[]){
        /*
        double x = (Math.log(18) / Math.log(2));
        if(x == (int) x)
            System.out.println(x);
        */


        //Strings:
        /*
        String s1 = "  abcdcde f ";
        String s2 = new String("ef");

        char ch[] = {'g','h'};
        String s3 = new String(ch);

        System.out.println("Length(): " + s1.length());
        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("toUpperCase: " + s1.toUpperCase());
        System.out.println("ChatAt[0]: " + s1.charAt(0));
        System.out.println("indexOf c: " + s1.indexOf("c"));
        System.out.println("indexOf cde: " + s1.indexOf("cde"));
        System.out.println("subString [1,3[: " + s1.substring(1, 3));
        System.out.println("contains bc? " + s1.contains("bc"));
        System.out.println("contains bd? " + s1.contains("bd"));
        System.out.println("trim (remove beggining & ending spaces only):" + s1.trim());
        System.out.println("replace cd by x: " + s1.replace("cd", "x"));

        String st[] = s1.split("c");
        System.out.print("split at c: ");
        for(int i=0 ; i<st.length ; i++){
            System.out.print(st[i] + " , ");
        }
        */
 
        //-----------------------------------------------------------------

        //Arrays:
        /*
        int a[] = {1,2,3};
        int b[] = new int[3];
        
        for(int i=0 ; i<b.length ; i++){
            b[i] = i + 4;
        }

        for(int x : b){
            System.out.println(x);
        }
        */

        //Anonymous Array: return new int[]{1,2,3}; 

        //Multidimensional Array:
        /*
        int c[][] = {{1,2},{3,4},{5,6}};    //i<3 , j<2
        int d[][] = new int[2][3];          //i<2 , j<3

        for(int i = 0 ; i<d.length ; i++){          //i<2
            for(int j = 0 ; j<d[0].length ; j++){   //j<3
                d[i][j] = (j+1) + (i*3);
            }
        }
        
        for(int i = 0 ; i<d.length ; i++){
            for(int j = 0 ; j<d[0].length ; j++){
                System.out.println("d[" + i + "][" + j + "] = " + d[i][j]);
            }
            System.out.println();
        }
        */

        //Jagged Array: Each column have a diff size
        /*
        int e[][] = {{1},{2,3,4},{5,6}};

        int f[][] = new int[3][];
        f[0] = new int[1];
        f[1] = new int[3];
        f[2] = new int[2];

        int count = 1;
        for(int i = 0 ; i<f.length ; i++){          
            for(int j = 0 ; j<f[i].length ; j++){  
                f[i][j] = count;
                count++;
            }
        }
        
        for(int i = 0 ; i<f.length ; i++){
            for(int j = 0 ; j<f[i].length ; j++){
                System.out.println("f[" + i + "][" + j + "] = " + f[i][j]);
            }
            System.out.println();
        }
        */
        //Sort Array:
        /*
        int sa[] = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        Arrays.sort(sa);
        System.out.print("Sorted Array: ");
        for(int i=0 ; i<sa.length ; i++)
            System.out.print(sa[i] + " ");
        */
        //Remove Array Duplicates: A -> S then S -> A
        /*
        Integer[] newArray = new Integer[sa.length];
        int k = 0;
        for (int value : sa) {
            newArray[k++] = Integer.valueOf(value);
         }
         
        Set<Integer> ms = new HashSet<Integer>(Arrays.asList(newArray));
        System.out.println("\n Set: " + ms);
        int ma[] = new int[ms.size()];
        int kk = 0;
        for(int x : ms){
            ma[kk++] = x;
        }
        System.out.print("No Dup: ");
        for(int i=0 ; i<ma.length ; i++)
        System.out.print(ma[i] + " ");
        */
            
        

        //-----------------------------------------------------------------
        //Collections: https://www.javatpoint.com/collections-in-java
        //-----------------------------------------------------------------


        //LIST:
            //ArrayList:
        /*
        List L = new ArrayList<Integer>();
        L.add(3);
        L.add(1);
        L.add(2);
        System.out.println("L before sorting: " + L);  //Printing L calls toString <=> L.toString();
        Collections.sort(L);    //For premitive types
        System.out.println("L after sorting: " + L);

        List S = new ArrayList<Student>();
        S.add(new Student("Mhmd" , 90));
        S.add(new Student("Ali" , 65));
        S.add(new Student("John" , 80));
        System.out.println("S before sorting: " + S);
        Collections.sort(S, new SortStudents());    //For non-premitive types we need comparator
        System.out.println("S after Sorting: " + S);
        */
        /*
        L.size();
        L.contains(3);
        L.remove(0);
        L.get(0);
        L.clear();
        */
        
            //Arrays.asList(1,2,3); // returns List: [1,2,3]

        //LinkedList



        //Stack
        //Stack<Integer> stack = new Stack();
        //push: pushes an element and return it
        //peek: returns the top element in the stack WITHOUT removing it
        //pop: removes and returns the top element of the stack
        //isEmpty ...
/*
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        */

        //QUEUE:

        //PriorityQueue

        //SET:

        //HashSet
        
        /*
        String s1 = "abc";

        Set<Character> s = new HashSet<Character>();
        s.add('a');
        s.add(s1.charAt(2));

        System.out.println(s);
        //System.out.println(s.size());
        //System.out.println(s.contains(2)
           */

         //TreeSet
    //}
}