import java.util.Arrays;
public class reverseArray{
    
    public static void reverseArray(int[] arr, int n){
        int temp;
        int length = (n-1);
        
        for(int i=0; i<n/2; i++){
            temp = arr[i];
            arr[i] = arr[length-i];
            arr[length-i] = temp;
        }
        System.out.println("Reverse Array : "+Arrays.toString(arr));
    }

    public static void main(String []args){
        int[] arr = {23,7,88,21,98,64,37,2,43,1};
        int n = arr.length;
        reverseArray(arr, n);
    }
}