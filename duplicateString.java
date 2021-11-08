public class duplicateString{
    public static String findDuplicate(String value){
        int[] arr = new int[256];
        int length = value.length();
        String output = "";
        
        if(length < 2){
            return value;
        }
        
        for(int i=0; i<length; i++){
            arr[value.charAt(i)]++;
        }
        
        for(int j=0; j<length; j++){
            if(arr[(int)(value.charAt(j))] != 0){
                output += (char)(value.charAt(j));
                arr[(int)(value.charAt(j))] = 0;
                
            }
        }
        return output;
    }

     public static void main(String []args){
        String value = "CsharpstarZ";
        System.out.println(findDuplicate(value));
     }
}