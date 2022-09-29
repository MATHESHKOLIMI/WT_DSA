//https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack();
        // if(s.length() %2 ==1 || s.startsWith(")") || s.startsWith("]") || s.startsWith("}")){
        //     return false;
        // }else{
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
	                stack.push(s.charAt(i));
	            }else{
                     if(stack.isEmpty()){
                         return false;
                     }
                     else if((s.charAt(i) == '}' && stack.peek()== '{') || (s.charAt(i) == ']' && stack.peek()== '[') || (s.charAt(i) == ')' && stack.peek()== '(')){
                        stack.pop();
                    } else{
                         return false;
                     }
                }
	        }
        // }
        return stack.isEmpty();
    }
}