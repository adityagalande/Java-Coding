public class StringAnagram{
    
    public static void CheakStringAnagram(String s1, String s2){
        int[] TempArray = new int[256];
        int index;
        boolean flag = true;
        
        if(s1.isEmpty() || s2.isEmpty()){
            System.out.println("String is not Anagram!");
        }else{
            for(char c1 : s1.toCharArray()){
                index = (int) c1;
                TempArray[index]++;
            }
            
            for(char c2 : s2.toCharArray()){
                index = (int) c2;
                TempArray[index]--;
            }
            
            for(int i=0; i<TempArray.length; i++){
                if(TempArray[i] != 0){
                    flag=false;
                }
            }
            if(flag){
                System.out.println("String "+s1+" & "+s2+" are Anagram.");
            }else{
                System.out.println("String "+s1+" & "+s2+" are not Anagram.");
            }
        }
        
    }

    public static void main(String []args){
        String s1 = "INTEGRAL";
        String s2 = "TRIANGLE";
        CheakStringAnagram(s1, s2);
    }
}