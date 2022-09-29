//https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
        String str= s.toLowerCase();
        for(int i =0; i<str.length(); i++){
            int intVal=str.charAt(i);
            if((intVal>=97 && intVal<=122) || (intVal>=65 && intVal<=90) || (intVal>=48 && intVal<=57) ){
                sb.append(str.charAt(i));
            }
        }
        str=sb.toString();
        return sb.reverse().toString().equals(str);
    }
}