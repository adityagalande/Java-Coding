import java.util.*;
public class arrangeArrayEvenOdd{
    
    public static void alternetRearrange(int[] arr, int n){
        Arrays.sort(arr);
        
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        
        boolean flag = false;
        
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                v1.add(arr[i]);
            }else{
                v2.add(arr[i]);
            }
        }
        
        if(arr[0] % 2 == 0){
            flag = true;
        }
        
        int index = 0, i = 0, j = 0;
        
        while(index < n){
        if(flag == true){
            arr[index] = (int)v1.get(i);
            index++;
            i++;
            flag = !flag;
        }else{
            arr[index] = (int)v2.get(j);
            index++;
            j++;
            flag = !flag;
        }    
        }
        
        for(int k=0; k<n; k++){
            System.out.println(arr[k]);
        }
    }
    
     public static void main(String []args){
        int[] arr = {9, 8, 13, 2, 19, 14};
        int n = arr.length;
        alternetRearrange(arr, n);
     }
}