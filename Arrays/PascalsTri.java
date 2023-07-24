import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class PascalsTri {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
		ArrayList<ArrayList<Long>> ans=new ArrayList<>();
		
		for(int row=1;row<=n;row++){
			ArrayList<Long> tl=new ArrayList<>();
			long a=1;
			//tl.add(a);
			for(int col=1;col<=row;col++){
				tl.add(a);
				a=a*(row-col);
				a=a/col;
				
			}
			ans.add(tl);
		}
		return ans;
	}
}
