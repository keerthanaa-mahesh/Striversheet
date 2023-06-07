import java.util.* ;
import java.io.*; 


    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }




public class BottomView {

    static class Pair{
        int hd;
        BinaryTreeNode node;
        public Pair(int hd,BinaryTreeNode node){
            this.hd=hd;
            this.node=node;
        }
    }
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
         // Write your code here. 
         Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,Integer> hm=new TreeMap<>();
        
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr=q.remove();
            hm.put(curr.hd,curr.node.val);
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> i:hm.entrySet()){
            ans.add(i.getValue());
        }
        
        return ans;        
    }

    
}

