import java.util.HashSet;

public class distinctNumber{
    public static String distinctNumber(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        return set.toString();
    }

     public static void main(String []args){
         int arr[] = { 10, 5, 3, 4, 3, 5, 6, 7, 7, 9};
         int n = arr.length;
         System.out.println(distinctNumber(arr, n));
     }
}