package udemy.udemy4_2;

import java.util.HashSet;
import java.util.Set;

public class Udemy4_2 {

	public static void main(String[] args) {
		System.out.println(isUniqChar("abcc"));

	}
	
	public static boolean isUniqChar(String s) {
		Set<Character> set = new HashSet<Character>();
		
		for(char c : s.toCharArray()){
			if(set.contains(c)){
				return false;
			}else{
				set.add(c);
			}
		}
		
		return true;
	}

}
