public class Factorial{
    
    public static void getFactorial(int num){
        double temp = 1;
        if(num < 0){
            System.out.println("Invalid");
        }if(num == 0){
            System.out.println(0);
        }
        
        for(int i=num; i>1; i--){
            temp *= i;
        }
        
        System.out.println(temp);
    }

     public static void main(String []args){
         int num = 65;
         getFactorial(num);
     }
}