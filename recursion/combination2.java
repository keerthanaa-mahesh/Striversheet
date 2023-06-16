import java.util.*;

public class combination2
{
    static void find(int ind,int n,int target,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> al, ArrayList<Integer>ds) {
        if(target == 0) {
            al.add(new ArrayList<>(ds)); 
            return; 
        }
        
        for(int i = ind; i < arr.size();i++) {
            if(i > ind && arr.get(i) == arr.get(i-1)) continue; 
            if(arr.get(i)>target) break; 
            if(arr.get(i)<=target){
            ds.add(arr.get(i)); 
            find(i+1,n,  target - arr.get(i),arr, al, ds); 
            ds.remove(ds.size() - 1); 
            }
            
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        find(0,n,target,arr,al,new ArrayList<>());
        return al;
    }
}
