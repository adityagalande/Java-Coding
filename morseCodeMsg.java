public class morseCodeMsg{
    
    public static int morseCodeMsg(String[] msg, int n){
        int c1=0, c2=0, c3=0;
        
        if(msg.length == 0){
            return 0;
        }
        
        for(int i=0; i<n; i++){
            String temp = msg[i];
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(0) == '.' && temp.charAt(temp.length() - 1) == '-'){
                    if(temp.charAt(j) == '.'){
                        c1++;
                    }else{
                        c2++;
                    }
                }
            }
            if(c1 == c2 && c1 != 0 && c2 != 0){
                c3++;
            }
            
            c1=0;
            c2=0;
        }
        
        return c3;
    } 

     public static void main(String []args){
        String[] msg = {".-.-.-.-", "...---.-", "..--.-.", ".-"};
        int n = msg.length;
        System.out.println(morseCodeMsg(msg, n));
     }
}