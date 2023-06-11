import java.util.* ;
import java.io.*; 

class Pair{
	int dist;
	int node;
	public Pair(int dist,int node){
		this.dist=dist;
		this.node=node;
	}
}
public class dijkstras {
	
	public static ArrayList < Integer > dijkstra(ArrayList<ArrayList<Integer>> adj,int v,int e,int s){
		// Write your code here.
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		int[] dist=new int[v];
		for(int i=0;i<v;i++) dist[i]=(int)(1e9);
		pq.add(new Pair(0,s));
		dist[s]=0;
		while(!pq.isEmpty()){
			int d=pq.peek().dist;
			int n=pq.peek().node;
			pq.remove();
			//Integer y=adj.get(n).get(n);
			for(int i=0;i<adj.get(n).size();i++){
				int di=adj.get(n).get(i).get(2);
				int no=adj.get(n).get(i).get(1);
				if(d+di<dist[no]){
					dist[no]=d+di;
					q.add(new Pair(dist[no],no));
				}
			}
		}
		Arrays.asList(dist);
		return dist;
	}
}
