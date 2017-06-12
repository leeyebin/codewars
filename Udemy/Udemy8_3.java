package udemy;

import java.util.Stack;

public class Udemy8_3 {
	public static void main(String args[]){
		PalindromeChecker pm = new PalindromeChecker();
		System.out.println(pm.isPalindrome("aabb"));
	}
}

class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        Stack<Character> sentence = new Stack<Character>();
        
    	if(s.length()==0){
    		return false;
    	}
        
        for(int i=0; i<s.length()/2; i++){
        	if(i<s.length()/2){
        		sentence.add(s.charAt(i));
        	}else{
        		if(sentence.peek()==s.charAt(i)){
        			sentence.pop();
        		}else{
        			return false;
        		}
        	}
        }
		return true;        
    }
}