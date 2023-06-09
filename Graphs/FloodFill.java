import java.util.*;

public class FloodFill
{
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        int ic=image[x][y];
        
         int[][] ans=image;
       int[] delrow={-1,0,+1,0};
        int[] delcol={0,+1,0,-1};
        dfs(x,y,newColor,image,ans,delrow,delcol,ic);
        return ans;
    }

    static void dfs(int sr,int sc,int newcolor,int[][] image,int[][] ans,int[] delrow,int[] delcol,int inicolor){
            ans[sr][sc]=newcolor;
            int n=image.length;
            int m=image[0].length;
            for(int i=0;i<4;i++){
                int nsr=sr+delrow[i];
                int nsc=sc+delcol[i];
                if(nsr>=0 && nsc>=0 && nsr<n && nsc<m && image[nsr][nsc]==inicolor && ans[nsr][nsc] != newcolor){
                    dfs(nsr,nsc,newcolor,image,ans,delrow,delcol,inicolor);
                }
            }

    }
}


