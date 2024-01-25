// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.PriorityQueue;

// public class kFrequent{
//     public static void main(String[] args) {
//         int []arr={2,1,2,3,1,1,3,2};
//         int k=2;
//         ans(arr, k);
//     }
//     public static void ans(int arr[],int k){
//         int n=arr.length;
//         Map<Integer,Integer>mp=new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
//         }
//         for (int i : arr) {
//             System.out.println(arr[i]);
//         }
//         PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(Pair p)->q);
//         for(Map.Entry<Integer,Integer> singleKeyValuePair:mp.entrySet()){
//             Pair p=new Pair(it.getKey(),it.getValue());
//             pq.add(p);


//         }
//         while(k!=0){
//             System.out.println(pq.poll().k+" ");
//             k--;
//         }
//     }

// }

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class kFrequent {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 1, 1, 3, 2};
        int k = 2;
        ans(arr, k);
    }

    public static void ans(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        
        // Count the frequency of each element in the array
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        
        // Create a max heap based on frequency using PriorityQueue
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> -p.value));
        
        // Populate the priority queue with pairs (element, frequency)
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            Pair p = new Pair(entry.getKey(), entry.getValue());
            pq.add(p);
        }

        // Print the top k frequent elements
        while (k != 0) {
            System.out.println(pq.poll().key + " ");
            k--;
        }
    }

    // Pair class to represent an element and its frequency
    static class Pair {
        int key; // Element
        int value; // Frequency

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
