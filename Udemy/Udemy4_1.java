package udemy.udemy4_1;

public class Udemy4_1 {

	public static void main(String[] args) {
		System.out.println(convert("123"));

	}
	
	public static int convert(String s){
		char[] a = s.toCharArray();
		int sum = 0;
		for(char c : a){
			sum *= 10;
			sum += c-'0'; //아스키코드값 '0'은 48을 뜻하기 때문에 빼준다.
		
		}
		
		return sum;
	}

}
