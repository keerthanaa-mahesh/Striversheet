import java.io.*;
import java.util.* ;

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


 public class Intersectionofll {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
	Node temp1=firstHead;
		Node temp2=secondHead;
		int c1=0;
		int c2=0;
		while(temp1!=null){
			c1++;
			temp1=temp1.next;
		}
		while(temp2!=null){
			c2++;
			temp2=temp2.next;
		}
		Node temp=firstHead;
		int n=0;
		if(c1>c2){
			n=c1-c2;
			while(n>0){
				temp=temp.next;
				n--;
			}
		}
		Node temp3=secondHead;
		if(c1<c2){
			n=c2-c1;
			while(n>0){
				temp3=temp3.next;
				n--;
			}
		}

		while(temp!=temp3){
			temp=temp.next;
			temp3=temp3.next;
		}

		
		return temp.data;
    }
}
