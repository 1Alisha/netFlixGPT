public class pythagorasTriplet{
    public static boolean checkEle(int arr[],int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    public static int square(int x){
        return x*x;
    }
    public static boolean sol(int arr[],int n){
        int hypo=n-1;
        for (int i = 0; i < arr.length-2; i++) {
            if(square(arr[i])+square(arr[i+1])==square(hypo)){
                System.out.println(i+" "+i+1+" "+hypo);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={3,2,4,6,5};
        int n=a.length;
        if(sol(a,n)==true){
            System.out.println("pythagoras triplet");
        }else{
            System.out.println("not a pythagoras triplet");
        }

    }
}