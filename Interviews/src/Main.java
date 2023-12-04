import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    
    public static void printNodes(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void recPrintNodes(ListNode head){
        if(head == null)
            return;
        System.out.println(head.val);
        recPrintNodes(head.next);
    }

    public static int countNodes(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static int recCountNodes(ListNode head){
        if(head == null)
            return 0;
        if(head.next == null)
            return 1;
        return 1 + recCountNodes(head.next);
    }

    public static ListNode removeElements(ListNode head , int val){
        if(head == null)
            return head;

        if(head.next == null)
            if(head.val == val)
                return null;
            else
                return head;

        while(head.val == val)  //if the first value(s) are == val, ignore them
            head = head.next;
        
        ListNode p = head;
        while(p!=null && p.next != null){

            while(p.next != null && p.next.val == val){
                p.next = p.next.next;
            }
            p = p.next;
        }

        return head;  
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null)
            return head;
        if(head.next == null && n == 1)
            return null;
        
        int index = countNodes(head) - n; //index of the previous node
        
        if(index == 0){         //The nth element is the first element in the list
            head = head.next;
            return head;
        }
        
        ListNode p = head;
        int count = 1;
        while(p != null && p.next != null){
            if(index == count){
                p.next = p.next.next;
                return head;
            }
            p = p.next;
            count++;
        }
            return head;
    }

    public ListNode swapNodes(ListNode head, int k) {
        int s = countNodes(head) - k + 1;
        
        if(k == s)      //same element
            return head;
        
        if(head == null)
            return head;
        
        if(head.next == null)
            return head;
        
        ListNode p = head;
        ListNode q = head;
        int countP = 1;
        int countQ = 1;
        while(countP != k){
            p = p.next;
            countP++;
        }
        while(countQ != s){
            q = q.next;
            countQ++;
        }
        int temp = p.val;
        p.val = q.val;
        q.val = temp;
        return head;
    }

    public static ListNode pointerAtKth(ListNode head , int k){
        return head.next;
    }

    public static void replaceElement(ListNode head , int e , int r){
        if(head.val == e){
            head.val = r;
            return;
        }
            

        replaceElement(head.next, e, r);
        
    }

    public static ListNode reverseOneGroup(ListNode head , int k){
        if(k == 1)
           return head;
       
       //ListNode s = head;
       ListNode p1 = head;
       ListNode p2 = head.next;
       ListNode p3 = head.next.next;
       int count = 1;
       
       while(p3 != null){
           
           p2.next = p1;
           count++;
           if(count == k){
               
               if(p2 == p3){
                   head.next = null;
                   head = p2;
                   return head;
               }
               else{
                   head.next = p3;
                   head = p2;
                   return head;
               }   
           }
           
           p1 = p2;
           p2 = p3;
           if(p3.next != null)
               p3 = p3.next;
           
       }
       return head;
   }
   
      
    public static void addNode(ListNode l , int val){
         
        if(l.next == null){
            l.next = new ListNode(val , null);
            return;
        }
        
        addNode(l.next , val);
        
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        
        ListNode l;
        if(list1.val <= list2.val){
            l = new ListNode(list1.val);
            list1 = list1.next;
        }
        else {
            l = new ListNode(list2.val);
            list2 = list2.next;
        }
        
        while(list1 != null && list2 != null){
            while(list1 != null && list2 != null && list1.val <= list2.val){
                addNode(l , list1.val);
                list1 = list1.next;
            }
            while(list1 != null && list2 != null && list1.val > list2.val){
                addNode(l , list2.val); 
                list2 = list2.next;
            }

        }
        while(list1 != null && list2 == null){
            addNode(l , list1.val);
            list1 = list1.next;
        }
       
        while(list2 != null && list1 == null){
            addNode(l , list2.val);
            list2 = list2.next;
        }
        return l;
    }
    
    /*public static void main(String args[]){

        
        ListNode node = new ListNode();
        ListNode head = new ListNode(3 , new ListNode(1 , new ListNode(2 , new ListNode(5 , new ListNode(4)))));
        
        ListNode list1 = new ListNode(1 , new ListNode(2 , new ListNode(7)));
        ListNode list2 = new ListNode(4, new ListNode(6 , new ListNode(8)));
        ListNode l = mergeTwoLists(list1, list2);
        printNodes(l);


        //head = removeElements(head , 4);
        //printNodes(head);
        //recPrintNodes(head);
        //System.out.println("\n" + countNodes(head));
        //System.out.println(recCountNodes(head));
        //ListNode p = pointerAtKth(head, 2);
        //System.out.println("\n after:");
        //printNodes(p);
        //printNodes(head);
        //head = reverseOneGroup(head, 3);
        //System.out.println("\n after:");
        //printNodes(head);
    
        //Stack<Integer> s = new Stack<>();
        
    }*/
    
}

/*
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        return helper(root , a);
    }
    public List<Integer> helper(TreeNode root , List<Integer> a){
        
        if(root != null){
            helper(root.left , a);
            a.add(root.val);
            helper(root.right , a);
        }
        return a;
    }
}
*/

/*

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> a = new ArrayList<Integer>();
        return helper(root , a);
    }
    public List<Integer> helper(Node root , List<Integer> a){
        
        if(root != null){
            for(int i=0 ; i<root.children.size() ; i++){
                helper(root.children.get(i) , a);
            }
            a.add(root.val);
        }
        return a;
    }
}
*/