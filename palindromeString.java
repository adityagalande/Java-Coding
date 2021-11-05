public class palindromeString{
    public static void palindrome(String value){
        int left = 0, right = value.length() - 1;
        boolean flag = false;
        
        for(int i=0; i< value.length() / 2; i++){
            if(value.charAt(left) == value.charAt(right)){
                left ++;
                right --;
                flag = !flag;
            }else{
                System.out.println("NOPE!!!");
                flag  = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("palindrome");
        }
        
    }

     public static void main(String []args){
        String value = "abataba";
        palindrome(value);
     }
}