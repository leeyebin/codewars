package udemy5_4;

import java.util.ArrayList;
import java.util.List;

public class Udemy5_4 {
	public static void main(String args[]){
		List<String> a = Permutation.getPermutations("1234");
		
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}
}

class Permutation{
	public static List<String> getPermutations(String s){
		if(s==null){
			return null;
		}
		return permRec(s, new boolean[s.length()], "", new ArrayList<String>());
	}
	
	private static List<String> permRec(String s, boolean[] pick, String perm, ArrayList<String> result){
		if(perm.length() == s.length()){
			result.add(perm);
			return result;
		}
		for(int i=0; i<s.length(); i++){
			if(pick[i]){
				continue;
			}
			pick[i] = true;
			permRec(s, pick, perm + s.charAt(i), result);
			pick[i] = false;
		}
		return result;
	}
}
