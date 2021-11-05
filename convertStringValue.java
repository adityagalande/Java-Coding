// WAP to convert lowercase to uppercase and vice versa without using inbuilt functions.
public class convertStringValue{
    
    public static String convertString(String value){
        System.out.println(value);
        String outputString = "";
        
        if(value.length() < 1){
            return "String is empty.";
        }
        
        for(int i=0; i<value.length(); i++){
            if(value.charAt(i) > 64 && value.charAt(i) < 91){
                outputString += (char)(((int)value.charAt(i)) + 32);
                continue;
            }if(value.charAt(i) > 96 && value.charAt(i) < 123){
                outputString += (char)(((int)value.charAt(i)) - 32);
                continue;
            }else{
                outputString += value.charAt(i);
            }
        }
        return outputString;
    }

     public static void main(String []args){
        String value  = "AdiTyA GaLAndE ${}[]";
        System.out.println(convertString(value));
     }
}