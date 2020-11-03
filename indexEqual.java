//Value equal to index value

class indexEqual {
    static void indexequal(int[]arr, int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i]==j){
                   System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[]args) {
        int arr[] = {15, 2, 45, 12, 7, 89, 55, 67};
        int n = arr.length;
        indexequal(arr,n);
    }
}