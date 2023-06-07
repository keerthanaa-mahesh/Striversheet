import java.io.*;
import java.util.* ;


	//Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

public class Reversell 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		if(head==null || head.next==null) return head;
		LinkedListNode prev=null;
        LinkedListNode curr=head;
        LinkedListNode after=head.next;
        while(after!=null){
           
            curr.next=prev;
            prev=curr;
            curr=after;
            after=after.next;
        }
        curr.next=prev;
        head=curr;
        return head;
		

    }
}
