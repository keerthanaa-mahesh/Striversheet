import java.util.*;
import java.util.Deque;

class Pair{
    int nod;
    int parent;
    public Pair(int nod,int parent){
        this.nod=nod;
        this.parent=parent;
    }
}
public class cycleundirected {
    
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int x=edges.length;
        int y=edges[0].length;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(edges[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(dfs(0,adj,vis)==true){
                    return "yes";
                }
            }
        }
        return "no";
    }

    static boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] vis){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(node,-1));
        vis[node]=1;
        while(!q.isEmpty()){
            int n=q.peek().nod;
            int par=q.peek().parent;
            q.remove();
            for(Integer i:adj.get(n)){
                if(vis[i]==0){
                vis[i]=1;
                q.add(new Pair(i,n));
            }else if(i!=par){
                return true;
            }
        }
    }
    return false;
 //      vis[n]=1;
//         for(Integer i:adj.get(n)){
//             if(vis[i]==0){
//                 if(checkCycle(i,n,adj,vis)==true) return true;
//             }else if(i!=par) return true;
//         }
//         return false;  
        
    }
    
}
