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


public class Inorder {
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;

        return inorder(list,root);
    }

    static List inorder(List<Integer> list,TreeNode root){
        if(root==null) return list;
        inorder(list,root.left);
        list.add(root.data);
        inorder(list,root.right);
        return list;
    }
}
