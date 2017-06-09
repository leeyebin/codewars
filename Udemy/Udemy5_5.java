package udemy;

import java.util.ArrayList;
import java.util.List;

public class Udemy5_5 {
	public static void main(String args[]){
		List<String> sentence = Parentheses.getPairs(2);
		
		for(int i=0; i<sentence.size(); i++){
			System.out.println(sentence.get(i));
		}
	}

}

class Parentheses {
    public static List<String> getPairs(int n) {
    	if(n%2!=0){
    		return null;
    	}    	
    	return getPairsRec(n, n, "", new ArrayList<String>());
	}
    
    private static List<String> getPairsRec(int l, int r, String pairs, ArrayList<String> list){
    	if(l>r||l<0||r<0 ){
    		return list;
    	}else if(l==0&&r==0){
    		list.add(pairs);
    		return list;
    	}
    	getPairsRec(l-1, r, pairs + "(", list);
    	getPairsRec(l, r-1, pairs + ")", list);
    	
    	return list;
    }
}