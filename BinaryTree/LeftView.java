import java.util.* ;
import java.io.*; 
import java.util.ArrayList;


    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };



public class LeftView
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> al=new ArrayList<>();
        printleftview(root,al,0);
      return al;
    }
     static void printleftview(TreeNode<Integer> root,ArrayList<Integer> list,int level){
        if(root==null) return;
        //if(list.get(level)==null) list.add(level,root.data);
        // to check if the size of the list is equal to level or not if it is not equal then it is already occupied
         if(list.size()==level){
        list.add(root.data);
        }
        printleftview(root.left,list,level+1);
        printleftview(root.right,list,level+1);
    }
}

