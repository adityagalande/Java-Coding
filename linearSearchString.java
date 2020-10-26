// Java program to find x string element in a given array using linear search 
public class linearSearchString{
    
    public static void searchString(String[] arr, int n, String x){
        int i;
        for(i=0; i<n; i++){
            if(arr[i] == x){
                System.out.println("String is at position "+i);
                break;
            }
        }
        
        if(i == n){
            System.out.println("String not found!");
        }
    }

    public static void main(String []args){
    
        String[] arr = {"JavaFX", "OpenCV", "ApacheFlume", "ApacheHadoop", "WebGL"};
        int n = arr.length;
        String x = "ApacheHadoop";
        searchString(arr, n, x);
    }
}