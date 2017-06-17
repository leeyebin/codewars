package codewars.Scramblies;

import java.util.LinkedList;
import java.util.List;

public class Scrablies {

	public static void main(String[] args) {
		System.out.println(Scrablies.scramble("katas", "steak"));

	}

	public static boolean scramble(String str1, String str2) {
		List<Character> m1 = new LinkedList<Character>();
		
		for(char c : str1.toCharArray()){
			m1.add(c);
		}
		
		for(char c : str2.toCharArray()){
			if(!m1.remove((Character)c)){
				return false;
			}
		}
		
		return true;
	}

}
