public class convertDecimalToBinary{
    
    public static void convertDecimalToBinary(int num){
        int[] arr = new int[1000];
        int i = 0;
        
        if(num < 0){
            System.out.println("Invalid number");
        }
        
        while(num > 0){
            arr[i]  = num % 2;
            num = num / 2;
            i++;
        }
        
        for(int j=(i-1); j>=0; j--){
            System.out.print(arr[j]);
        }
    }
	public static void main(String[] args) {
	    int num = 73;
	    convertDecimalToBinary(num);
	}
}