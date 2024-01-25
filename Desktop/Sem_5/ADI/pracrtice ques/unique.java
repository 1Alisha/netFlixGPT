import java.util.ArrayList;
import java.util.HashMap;

public class unique {
    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
		ArrayList<Integer>ans=new ArrayList<>();
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.size();i++){
			map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
            
		}
	}
    public static void main(String[] args) {
        int arr[]={1,2,5,2,9,0,7,2,3,4};
    }
}
