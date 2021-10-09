/*
Input: 
S1 = "ddcf", S2 = "cedk", N = 4
Output: 2
Explanation: We can change 'e' and 'k' in
S2 to 'd' and 'f' to make both the strings
anagram. 
*/

public class checkMinManipulationAnagrams{
    
    public static void checkAnagrams(String s1, String s2){
        int[] arr = new int[256];
        int temp = 0;
        
        for(int j=0; j<s1.length(); j++){
            arr[s1.charAt(j)]++;
        }
        
        for(int k=0; k<s2.length(); k++){
            arr[s2.charAt(k)]--;
        }
        
        for(int i=0; i< arr.length; i++){
            if(arr[i] < 0){
                temp += Math.abs(arr[i]);
            }
        }
        
        System.out.println(temp);
    }

     public static void main(String []args){
        String s1, s2;
        s1 = "ircvsc";
        s2 = "xggbwk";
        checkAnagrams(s1, s2);
     }  
}