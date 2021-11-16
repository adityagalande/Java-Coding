public class checkPrimeNumber{
    
    public static void isPrime(int num1, int num2){
        boolean flag = false;
        if(num2 < 0){
            System.out.println("Invalid");
        }
        
        for(int i=num1; i<=num2; i++){
            for(int j=1; j<i; j++){
                if(i%1 == 0 &&  i%i == 0){
                    flag = true;
                }if(i%j == 0 && j != 1){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(i);
                flag = false;
            }
        }
    }

     public static void main(String []args){
        int num1 = 0, num2 = 42;
        isPrime(num1, num2);
     }
}