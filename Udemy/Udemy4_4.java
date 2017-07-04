package udemy.udemy4_4;

public class Udemy4_4 {

	public static void main(String[] args) {
		System.out.println(coding("aabbcccccc"));

	}

    public static String coding(String s) {
    	
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
