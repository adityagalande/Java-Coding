public class thirdLargestElement{
    
    public static void thirdLargestEle(int[] arr, int n){
        
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        
        if(n < 3){
            System.out.println("Invalid Array!");
        }else{
        
            for(int i=0; i<n; i++){
                if(arr[i] > first){
                    third = second;
                    second = first;
                    first = arr[i];
                }else if(arr[i] > second){
                    third = second;
                    second = arr[i];
                }else if(arr[i] > third){
                    third = arr[i];
                }
            }
            
            System.out.println("The third largest element : "+third);
        }
    }

    public static void main(String []args){
        int[] arr = {2,5,1,7,3,8};
        int n = arr.length;
        thirdLargestEle(arr, n);
    }
}
