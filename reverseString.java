public class reverseString{
    public static StringBuilder reverseString(StringBuilder str){
        
        for(int i=0; i<str.length()/2; i++){
            int front = i;
            int rare = str.length()-1-i;
            
            char l = str.charAt(front);
            char r = str.charAt(rare);
            
            str.setCharAt(front,r);
            str.setCharAt(rare,l);
        }
        return str;
    }

     public static void main(String []args){
         StringBuilder str = new StringBuilder("Execute");
         System.out.println(reverseString(str));
     }
}