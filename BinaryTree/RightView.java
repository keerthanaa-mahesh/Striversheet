import java.util.*;

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;
        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }



public class RightView {
    public static ArrayList<Integer> printRightView(BinaryTreeNode<Integer> root) {
       // Write your code here.
       ArrayList<Integer> al=new ArrayList<>();
       rightView(al,root,0);
       return al;
    }

    static void rightView(ArrayList<Integer> al,BinaryTreeNode<Integer> root,int level){
        if(root==null) return;

        if(al.size()==level){
            al.add(root.data);
        }
        rightView(al,root.right,level+1);
        rightView(al,root.left,level+1);
    }
}

