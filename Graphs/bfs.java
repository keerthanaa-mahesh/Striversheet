import java.util.* ;
import java.io.*; 
public class bfs {
	public static ArrayList<Integer> BFS(int v, int edges[][]){
ArrayList<Integer> ans=new ArrayList<>();
		Queue<Integer> q=new LinkedList<Integer>(); 
		int[] vis=new int[v+1];
		q.add(0);
        while(!q.isEmpty()){
			int c=q.remove();
			if(vis[c]==0){
				ans.add(c);
				vis[c]=1;
				for(int i=0;i<v;i++){
					if(edges[c][i]==1 && c!=i)
					q.add(i);
				}
			}
		}
		return ans;
	}
}

