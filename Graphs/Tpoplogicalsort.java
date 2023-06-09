import java.util.* ;
import java.io.*; 

public class tpoplogicalsort 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        int[] vis=new int[v];
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                dfs(i,edges,vis,st);
            }
        }

        for(int i=0;i<st.size();i++){
            list.add(st.pop());
        }
        return list;
    }

    static void dfs(int node,ArrayList<ArrayList<Integer>> edges,int[] vis,Stack<Integer> st){
        vis[node]=1;
        
        for(Integer i:edges.get(node)){
            if(vis[i]==0){
                dfs(i,edges,vis,st);
            }
        }
        st.push(node);
    }
}

