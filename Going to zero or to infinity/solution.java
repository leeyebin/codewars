//BigDecimal ����ϱ�

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
////////////////////////////////////////////////////////////

import java.math.BigDecimal;

public class Suite {
	
	public static double going(int n) {
		BigDecimal fact = new BigDecimal("1");
		BigDecimal result = new BigDecimal("0");
		
		for(int k=1; k<=n; k++){
			fact = fact.multiply(BigDecimal.valueOf(k));
			result = result.add(fact);
		}
		
		result = result.divide(fact, 6, BigDecimal.ROUND_FLOOR);
        return result.doubleValue();
	}
}