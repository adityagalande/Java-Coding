public class LongestName{
    
    public static void longname(String[] arr, int n){
       String LongName ="";
       boolean flag = true;
            
           if(n>0){
                for(int i=0;i<n;i++){
                    flag = false;
                        if(arr[i].length() > arr[0].length()){
                            flag = true;
                            LongName = arr[i];
                        }
                }
    
                if(flag){
                    System.out.println(LongName);
                }else{
                    System.out.println(arr[0]);
                }

            }else{
                System.out.println("Empty array");
            } 
    }

    public static void main(String []args){
    String[] arr = {"GeeksforGeeks", "Geek", "Geeks", "Geeksfor", "GeeksforGeek"};
    int n = arr.length;
    longname(arr,n);    
    
    }
}