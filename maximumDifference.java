public class maximumDifference{
    public static int maximumDifference(int[] arr, int n){
         int val = 0;
         
         for(int i=0; i<n; i++){
             for(int j=i+1; j<n; j++){
                 if(arr[j] - arr[i] > val){
                     val = arr[j] - arr[i];
                 }
             }
         }
         return val;
    }

     public static void main(String []args){
        //  int[] arr = {7,9,5,6,3,2};
         int[] arr = {2,3,10,6,4,8,1};
         int n = arr.length;
         System.out.println(maximumDifference(arr, n));
     }
}