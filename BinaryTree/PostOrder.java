//left right root

import java.util.* ;
import java.io.*; 

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }



public class PostOrder {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> l=new ArrayList<>();
        if(root==null) return l;
        return postOrder(l,root);
    }

    static List postOrder(List<Integer> list,TreeNode root){
        if(root==null) return list;
        postOrder(list,root.left);
        postOrder(list,root.right);
        list.add(root.data);
        return list;
    }
}
