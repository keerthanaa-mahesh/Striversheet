import java.util.*;

class nqueens {

    static void solve(int col,char[][] board,List<List<String>> ans,int[] leftrow,int[] updig,int[] lowdig){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(leftrow[row]==0 && updig[row+col]==0 && lowdig[board.length - 1 +col -row]==0){
                board[row][col]='Q';
                leftrow[row]=1;
                updig[row+col]=1;
                lowdig[board.length -1 + col - row]=1;
                 solve(col+1,board,ans,leftrow,updig,lowdig);
            board[row][col]='.';
            leftrow[row]=0;
            updig[row+col]=0;
            lowdig[board.length-1+col-row]=0;
            }
        }
    }

     static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int[] leftrow=new int[n];
        int[] updig=new int[2*n-1]; //diag gng upwards
        int[] lowdig=new int[2*n-1];
        solve(0,board,ans,leftrow,updig,lowdig);
        return ans;
    }
}
