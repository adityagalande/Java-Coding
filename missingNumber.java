// Java program to Find the repeating 
// and missing elements 
//Endcase is array should be size of largest elemnt of array
public class missingNumber{
    
    public static void missingElement(int[] arr, int n){
        
        for(int i=0; i<n; i++){
            int abs_val = Math.abs(arr[i]);
            if(arr[abs_val - 1] > 0){
                arr[abs_val - 1] = -arr[abs_val - 1];
            }else{
                System.out.println("Repeated number : "+abs_val);
            }
        }
        
        for(int j=0; j<n; j++){
            if(arr[j] > 0){
                System.out.println("Missing number : "+(j+1));
            }
        }
    }
    
    //Driver code
    public static void main(String []args){
        int[] arr = {2,4,1,5,6,7,1,8};
        int n = arr.length;
        missingElement(arr, n);
    }
}