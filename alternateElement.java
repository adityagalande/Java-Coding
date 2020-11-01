//Alternate elements of Array

import java.util.Arrays;
class alternateElement {
    static void alternate(int[] arr, int n) {
        int [] temp = new int[n];
        for(int i=0;i<n;i+=2) {
            temp[i]=arr[i];
            System.out.println(temp[i]);
        };
    }
    public static void main(String[]args) {
        int arr[] = {56, 42, 21, 23, 65, 20, 33, 17, 86, 99, 75};
        int n = arr.length;
        alternate(arr,n);
    }
}