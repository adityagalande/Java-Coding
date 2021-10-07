public class reverseNumber{
    
    public static void reverseNumber(int num){
        System.out.println("Original : "+num);
        // String temp = "";
        int temp = 0;
        if(num < 10){
            System.out.println("Invalid");
        }
        while(num > 0){
           temp = (temp * 10) + num % 10;
           num = num/10;
        }
        System.out.println("Reversed : "+temp);
        // System.out.println(Integer.parseInt(temp));
    }

     public static void main(String []args){
        int num = 43562;
        reverseNumber(num);
     }
}