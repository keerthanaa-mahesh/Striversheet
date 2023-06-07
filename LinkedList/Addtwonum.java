import java.util.* ;
import java.io.*; 


    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }




public class Addtwonum {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode l1=head1;
        LinkedListNode l2=head2;
        //if(l1==null || l2==null) return null;
        LinkedListNode dummy=new LinkedListNode(0);
        LinkedListNode temp=dummy;
        int carry=0;
        //carry==1 is necessary because what if the last elements carry is left but both the linked lists are empty
        while(l1!=null ||  l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            //int n=sum%10;
            carry=sum/10;
            LinkedListNode newnode=new LinkedListNode(sum%10);
            temp.next=newnode;
            temp=temp.next;
        }
        return dummy.next;

        
    }
}
