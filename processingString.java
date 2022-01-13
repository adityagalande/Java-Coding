public class processingString{
    
    public static String processingString(String str){
        String outputString = "";
        int sum = 0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) > 47 && str.charAt(i) < 58){
                sum += Character.getNumericValue(str.charAt(i));
            }else{
                outputString += str.charAt(i);
            }
        }
        
        return outputString+"\n"+sum;
    }

     public static void main(String []args){
         String str = "1HI!Hello6Everyone8@GoodByeto#all1";
         System.out.println(processingString(str));
     }
}