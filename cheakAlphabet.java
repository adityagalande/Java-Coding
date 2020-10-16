public class cheakAlphabet{

     public static void main(String []args){
         char letter = 'a';
         switch(letter) {
             
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(letter+"-> Vowel.");
            break;
            
            default:
            System.out.println(letter+"-> Alphabet.");
         }
     }
}