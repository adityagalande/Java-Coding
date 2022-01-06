/*
You are given an integer N and integer array A as the input, where N dentes the length of A Assume the sunse of A
to be S. Write a program to return the product of N and S
*/
public class isProduct{
    
    public static int isProduct(int[] arr){
        int product = 0;
        
        for(int i=0; i<arr.length; i++){
            product += arr[i];
        }
        product = arr.length * product;
        return product;
    }

     public static void main(String []args){
        int[] arr = {264, 334, 309};
        System.out.println(isProduct(arr));
     }
}
