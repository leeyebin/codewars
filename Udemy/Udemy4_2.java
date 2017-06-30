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
		}//Set의 특성을 이용할거면 그냥 집어넣고 원문의 길이와 set의 사이즈를 비교해보는 것도 방법일 것 같다.
		
		return true;
	}

}
