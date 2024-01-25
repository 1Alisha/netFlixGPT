public class swap {
    public static boolean sorted(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void maxi(int arr[]){
        int d=0;
        if(sorted(arr)!=true){
            for (int i = arr.length-1; i>=0; i++) {
            if(arr[i]>arr[i-1]){
                continue;
            }else{
                d=i;
                break;
            }
        }
        itn ans=
        for (int i = 0; i < d; i++) {
            ans
            
        }
        }
        
    }
    public static void main(String[] args) {
        
    }   
}
