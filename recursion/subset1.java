import java.util.* ;
import java.io.*; 
public class subset1 {

    static void find(int ind,int[] arr,ArrayList<Integer> al,int sum){
        if(ind==arr.length){
            al.add(sum);
            return;
        }

        sum+=arr[ind];
        find(ind+1,arr,al,sum);
        sum-=arr[ind];
        find(ind+1,arr,al,sum);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> al=new ArrayList<>();
       // Arrays.sort(num);
        find(0,num,al,0);
        //Collections.sort(al);
        return al;
    }

}
