import java.util.* ;
import java.io.*; 

//root lrft right

	
	

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



public class Preorder {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		List<Integer> l=new ArrayList<>();
		if(root==null) return l;
		return preOrder(l,root);
    }

	static List preOrder(List<Integer> list,TreeNode root){
		if(root==null) return list;
		list.add(root.data);
		preOrder(list,root.left);
		preOrder(list,root.right);
		return list;
	}
}
