import java.util.*;

class Pair{
	int first;
	int second;
	int time;
	public Pair(int first,int second,int time){
		this.first=first;
		this.second=second;
		this.time=time;
	}
}


public class RottenOranges {

	public static int minTimeToRot(int[][] grid, int n, int m) {
		// Write your code here.
		Queue<Pair> q=new LinkedList<Pair>();
		int[][] vis=grid;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==2){
					q.add(new Pair(i,j,0));
				}
			}
		}

		//bst
		int tm=0;
		int[] derow={-1,0,1,0};
		int[] decol={0,1,0,-1};
		while(!q.isEmpty()){
			int r=q.peek().first;
			int c=q.peek().second;
			int t=q.peek().time;
			q.remove();
			tm=Math.max(tm,t);
			for(int i=0;i<4;i++){
				int row=r+derow[i];
				int col=c+decol[i];
				if(row>=0 && row<n && col>=0 && col<m && vis[row][col]!=2 && grid[row][col]==1){
					q.add(new Pair(row,col,t+1));
					vis[row][col]=2;
				}
			}
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(vis[i][j]==1)
				return -1;
			}
		}
		return tm;
	}



}
