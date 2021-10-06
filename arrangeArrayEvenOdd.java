import java.util.Arrays;
public class arrangeArrayEvenOdd {

public static void arrangeEvenOdd(int[] arr, int n){

Arrays.sort(arr);

for(int i=0; i<n; i++){
System.out.println(arr[i]);
}

}

public static void main(String []args){
int[] arr = {9,6,8,2,1,5,4,12,17,13,20};
int n = arr.length;
arrangeEvenOdd(arr, n);
}
}