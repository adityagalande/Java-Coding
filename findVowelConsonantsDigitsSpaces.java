public class findVowelConsonantsDigitsSpaces{
    
    public static void findvowels(String letter){
        
        int vowels=0, consonants=0, digits=0, spaces=0;
        
        for(int i=0;i<letter.length();i++){
            char l = letter.charAt(i);
            
            if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u' || l=='A' || l=='E' || l=='I' || l=='O' || l=='U') {
                vowels++; 
            }if((l>='a'&& l<='z') || (l>='A'&& l<='Z')) {
                consonants++; 
            }if(l>='0' && l<='9') {
                digits++; 
            }if(l==' ') {
                spaces++;
            }
            
        }
        
        System.out.println("vowels : "+vowels);
        System.out.println("consonants : "+consonants);
        System.out.println("digits : "+digits);
        System.out.println("spaces : "+spaces);
    }

    public static void main(String []args){
        String letter = "John Hopkins";
        findvowels(letter);
    }
}