//BigDecimal 사용하기

public class Solution {

	public static double solution(int n) {
		double result = 0;
		double result1 = 0;
		
		for(int k=1; k<=n; k++){
			result1 += factorial(k);
		}
		
		result = (1 / factorial(n))*(result1);
		System.out.println(result);
		System.out.println(result1);
		
		return Math.floor(result*1000000)/1000000;
	}
	
	public static double factorial(int n){
		double dresult = 1;
		for(int i=1; i<=n; i++){
			dresult *= i;
		}
		return dresult;
	}
}