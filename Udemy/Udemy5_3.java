package codewars.udemy;

import java.util.ArrayList;

public class Udemy5_3 {

	public static void main(String[] args){
		ArrayList<String> a = bitCombinations(1);
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}
	
	public static ArrayList<String> bitCombinations(int n) {
        return bitCombRec(n, "", new ArrayList<String>());
    }
	private static ArrayList<String> bitCombRec(int n, String s, ArrayList<String> list){
		if(n==s.length()){
			list.add(s);
			return list;
		}
		
		bitCombRec(n, s + "0", list);
		bitCombRec(n, s + "1", list);
		return list;
	}

}
