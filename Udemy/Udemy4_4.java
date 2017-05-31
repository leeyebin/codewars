package udemy.udemy4_4;

public class Udemy4_4 {

	public static void main(String[] args) {
		System.out.println(coding("aabbcccccc"));

	}

    public static String coding(String s) {
    	/*Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
    	
    	for(char c: s.toCharArray()){
    		if(hashMap.containsKey(c)){
    			hashMap.put(c, hashMap.get(c)+1);
    		}else{
    			hashMap.put(c, 1);
    		}
    	}
    	
    	TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>(hashMap);
    	Iterator<Character> iteratorKey = tm.keySet().iterator();
    	
    	String t="";
    	while(iteratorKey.hasNext()){
    		char v = iteratorKey.next();
    		t = t + v + hashMap.get(v);
    	}
    	
    	return t;*/
    	
    	if(s==null){
    		return null;    				
    	}
    	
    	String result = "";
    	int count = 1;
    	char[] arr = s.toCharArray();
    	char prev = arr[0];
    	for(int i=1; i<s.length(); i++){
    		if(arr[i-1]!=arr[i]){
    			result = result +  prev + count;
    			prev = arr[i];
    			count = 1;
    		}else{
    			count++;
    		}
    		
    		if(i==s.length()-1){
    			result = result + prev + count;
    		}
    		
    	}
    	return result;
	}

}
