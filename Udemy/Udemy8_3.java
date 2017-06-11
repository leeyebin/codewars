package codewars.udemy;

import java.util.Stack;

public class Udemy8_3 {
	public static void main(String args[]){
		PalindromeChecker pm = new PalindromeChecker();
		System.out.println(pm.isPalindrome("civic"));
	}
}

class PalindromeChecker {
    public static boolean isPalindrome(String s) {
 
    	if(s.length()==0){
    		return false;
    	}
        Stack<Character> sentence = new Stack<Character>();
        String temp = "";
        
        for(char c : s.toCharArray()){
        	sentence.add(c);
        }
        while(!sentence.isEmpty()){
        	temp += sentence.peek();
        	sentence.pop();
        }
        if(s.equals(temp)){
        	return true;
        }else{
        	return false;
        }
    }
}