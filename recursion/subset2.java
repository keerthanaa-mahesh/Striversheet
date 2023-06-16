import java.util.* ;
import java.io.*; 
public class subset2 {
    static void find(int ind,int n,int[] arr,ArrayList<ArrayList<Integer>> al,ArrayList<Integer> ds){
        al.add(new ArrayList<>(ds));
        for(int i=ind;i<n;i++){
            //if it is not the first andn if it is dubicate lets continue/not pick up
            if(i!=ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            find(i+1,n,arr,al,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        find(0,n,arr,al,new ArrayList<>());
       // Collections.sort(al);
        return al;
    }

}