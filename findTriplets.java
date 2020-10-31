// Java program to find triplets 
// in a given array whose sum 
// is given sum. 
import java.util.Arrays;
public class findTriplets{
    
    public static void triplets(int[] arr, int n, int sum){
        Arrays.sort(arr);
        
        for(int i=0; i<n-1; i++){
            int left = i+1;
            int right = n-1;
            int temp = arr[i];
            
            while(left < right){
                
            if(temp + arr[left] + arr[right] == sum){
                System.out.println(temp+", "+arr[left]+", "+arr[right]);
            
                left++;
                right--;
            }else if(temp + arr[left] + arr[right] < sum){
                        left++;
                    }else{
                        right--;
                    }
            }
        }
    }

    public static void main(String []args){
        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;
        int sum = -2;
        triplets(arr, n, sum);
    }
}