// Java program to Find the minimum value 
// to be added so that array becomes balanced 

public class arrayBalancing{
    
    public static void balanceArray(int[] arr, int n){
        int side1=0, side2=0;
        
        for(int i=0; i<n/2; i++){
            side1 += arr[i]; 
        }
        
        for(int j=n/2; j<n; j++){
            side2 += arr[j];
        }
        
        if(side1 != side2){
            System.out.println("Add "+Math.abs(side1-side2)+" to Balance Array");
        }
    }

    public static void main(String []args){
    
        int[] arr = {1,2,2,2,1,3,2};
        int n = arr.length;
        balanceArray(arr, n);
    }
}