import java.util.*;
public class cycledirected {

  static boolean dfscycle(int node,ArrayList < ArrayList < Integer >> edges,int[] vis,int[] path){
    vis[node]=1;
    path[node]=1;

    //traverse for adj nodes
    for(Integer i:edges.get(node)){
      //if it is not visited then call for dfs
      if(vis[i]==0){
        if(dfscycle(i,edges,vis,path)==true)
        return true;
      }//ifthe node has been previously visited n also the path has been visited
      else if(path[i]==1){
        return true;
      }
    }

    //while going back mark it back as not visited
    path[node]=0;
    return false;
  }
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.
    //we need to create two arrays
    //one for the visited elenets and the other for the path traversed
    //if the cycle is from the path traversed then its a cycel
    int[] vis=new int[n];
    int[] path=new int[n];
    for(int i=0;i<n;i++){
      if(vis[i]==0){
        if(dfscycle(i,edges,vis,path)==true) return true;
      }
    }
    return false;
  }
}
