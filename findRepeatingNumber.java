// Java program to find one of the repeating  
// elements in a read only array  
public class findRepeatingNumber{
    
    public static void repeatingNumbers(int[] arr, int n){
        int max_num = arr[0];
        for(int i=1; i<n; i++){
            if(max_num < arr[i]){
                max_num=arr[i];
            }
        }
        
            int[] temp = new int[max_num + 1];
            
            for(int j=0; j<n; j++){
                temp[arr[j]]++;
            }
            for(int k=0; k<temp.length; k++){
                if(temp[k] > 1){
                    System.out.println(k+" repeated "+temp[k]+" times");
                }
            }
    }

     public static void main(String []args){
         //int[] arr = {2,1,3,4,6,2,5}
         int arr[] = {10, 1, 2, 3, 5, 4, 9, 8, 5, 6, 4};
         int n = arr.length;
         repeatingNumbers(arr, n);
     }
}