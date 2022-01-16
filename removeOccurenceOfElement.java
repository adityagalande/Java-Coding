/*
Remove every occurence of the number num from this array.
Move all remaning elements to right side of by preserving the original order of the element.
Fill the empty spots on left side with 1.
*/

import java.util.LinkedList;
public class removeOccurenceOfElement{
    
    public static void removeOccurence(int[] arr, int num){
        int len = arr.length, count=0;
        LinkedList<Integer> op = new LinkedList<>();
        
        if(len < 1){
            System.out.println("Invalid");
        }
        
        for(int i=(len) - 1; i>=0; i--){
            if(arr[i] == num){
                count++;
            }else{
                op.push(arr[i]);
            }
        }
        
        for(int j=1; j<=count; j++){
            op.push(1);
        }
        System.out.println(op.toString());
    }

     public static void main(String []args){
         int[] arr = {3,5,32,5,5,3,5};
         int num = 5;
         removeOccurence(arr, num);
     }
}