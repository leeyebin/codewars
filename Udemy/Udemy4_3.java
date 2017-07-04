package udemy.udemy4_3;

public class Udemy4_3 {

	public static void main(String[] args) {
		System.out.println(isAnagram("4s*&ss(a", "(*&asss"));

	}

	public static boolean isAnagram(String s1, String s2) {
		int a=0;
		비트연산자를 사용(XOR)
		for(char c : s1.toCharArray()){
			a ^= c;
		}
		for(char c : s2.toCharArray()){
			a ^= c;
		}
		
		if(a==0){
			return true;
		}
		return false;
	}

}
