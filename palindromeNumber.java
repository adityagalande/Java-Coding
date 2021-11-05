public class palindromeNumber{
    public static int palindrome(int num){
        int temp = 0, sum = 0;
        
        if(num < 10){
            return 0;
        }
        
        while(num > 0){
            temp = num % 10;
            sum = (sum * 10) + temp;
            num = num / 10;
        }
        return sum;
    }

     public static void main(String []args){
        int num = 523718;
        System.out.println(palindrome(num));
     }
}