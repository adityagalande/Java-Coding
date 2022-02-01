/*
Link : https://leetcode.com/problems/capitalize-the-title/

You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:

f the length of the word is 1 or 2 letters, change all letters to lowercase.
Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
*/

class capitalizeTitle {
    public static String capitalizeTitle(String title) {
        String[] s = title.split(" ");
        StringBuilder temp = new StringBuilder();
        
        for(int i=0; i<s.length; i++){
            if(s[i].length() > 2){
                String s1 = (s[i].substring(0,1)).toUpperCase();
                String s2 = (s[i].substring(1)).toLowerCase();
                temp.append(s1+s2+" ");
            }else{
                temp.append((s[i]).toLowerCase()+" ");
            }
        }
        
        return temp.toString().trim();
    }
    public static void main(String[]args){
        String title = "i lOve of leetcode";
        System.out.println(capitalizeTitle(title));
    }
}