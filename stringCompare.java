public class stringCompare{

     public static void main(String []args){
         String s1 = "silent";
         String s2 = "listen";
         boolean flag = true;
         int l1 = s1.length(),l2 = s2.length();
         
        if(l1==l2) {
            for(int i=0;i<l1;i++) {
                 char c1 = s1.charAt(i);
                 flag=false;
                for(int j=0;j<l2;j++) {
                     char c2 = s2.charAt(j);
                        if(c1 == c2){
                        flag = true;
                        }
                }
                
                if(!flag)
                break;
            }
         
            if(!flag){
             System.out.println("Strings are Not Equal.");
            }else {
            System.out.println("Strings are Equal.");
            }
            
        }else {
        System.out.println("Strings are Not Equal."); 
        }
         
    }
}