import java.io.*;
import java.util.* ;

 //Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 

 public class Middleofll
 {
     public static Node findMiddle(Node head)
     {
         // Write your code here.
         if(head==null || head.next==null) return head;
         Node slow=head;
         Node fast=head;
         while(fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
         }
         // if(fast==null) {return slow;}
         // else if(fast.next==null) 
         // return slow.next;
         return slow;
     }
 }
