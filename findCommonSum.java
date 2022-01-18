/*
Given an amy of positive integer, find the element which is positioned much that the sum of all the elements to its right is equal to the sum of all the elements to its eft Pr the sement and the sum Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings anywhere in the program, as these contribute to the standard output and test cases will fail.
*/

public class findCommonSum{
    
    public static int findPositionToSplit(int[] arr, int n){
        int pos = 0;
        int i=0, j=n-1,left=arr[0],right=arr[n-1];
        
        while(i<j){
            if(left<right){
                i++;
                left += arr[i];
            }if(left>right){
                j--;
                right += arr[j];
            }if(left==right){
                pos = i;
                i++;
                j--;
                left += arr[i];
                right += arr[j];
            }
        }
        return pos + 1;
    }
    
    public static int findCommonSum(int[] arr, int pos){
        int sum=0;
        for(int i=0; i<pos; i++){
            sum += arr[i];
        }
        return sum;
    }

     public static void main(String []args){
         int[] arr = {11,22,33,22,11,100,99};
         int n = arr.length;
         
         int pos = findPositionToSplit(arr, n);
         System.out.println(arr[pos]+" "+findCommonSum(arr, pos));
         
     }
}