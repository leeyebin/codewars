package codewars.Scramblies;

import java.util.HashMap;
import java.util.Map;

public class Scrablies {

	public static void main(String[] args) {
		System.out.println(Scrablies.scramble("katas", "steak"));

	}

	public static boolean scramble(String str1, String str2) {
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		Map<Character, Integer> m2 = new HashMap<Character, Integer>();
		
		
		for(char c : str1.toCharArray()){
			if(!m1.containsKey(c)){
				m1.put(c, 1);
			}else{
				m1.put(c, m1.get(c)+1);
			}
		}
		for(char c : str2.toCharArray()){
			if(!m2.containsKey(c)){
				m2.put(c, 1);
			}else{
				m2.put(c, m2.get(c)+1);
			}
		}
		
		for(int i=0; i<str2.length(); i++){
			char key = str2.charAt(i);
			if(m1.containsKey(key)){
				if(m1.get(key)>1){
					m1.put(key, m1.get(key)-1);
				}else{
					m1.remove(key);
				}
				
				if(m2.get(key)>1){
					m2.put(key, m2.get(key)-1);
				}else{
					m2.remove(key);
				}
			}
		}
		
		if(m2.isEmpty()){
			return true;
		}
		return false;
	}

}
