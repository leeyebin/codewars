다시 풀어야할 문제(소스 더러움)
package codewars.BackWardsPrime;

class Solution {
	public static String Solution(long start, long end) {
		long head = start;
		long tail = end;
		String primeNumbers = "";
		StringBuffer strBuffer = new StringBuffer();

		for (int i = (int) head; i <= (int) tail; i++) {
			if(i/10!=0){
				int counter = 0;
				for (int num = i; num >= 1; num--) {
					if (i % num == 0) {
						counter += 1;
					}
				}
				if (counter == 2) {
					int num1 = 0;
					int counter1 = 0;
					strBuffer = new StringBuffer();
					strBuffer.append(Integer.toString(i));
					strBuffer.reverse();
					num1 = Integer.parseInt(strBuffer.toString());
	
					for (int k = num1; k >= 1; k--) {
						if (num1 % k == 0) {
							counter1 += 1;
						}
					}
					if (counter1 == 2) {
						if(i!=num1){
						primeNumbers += i + " ";
						}
					}
	
				}
			}
		}
		primeNumbers = primeNumbers.substring(0, primeNumbers.length()-1);
		
		return primeNumbers;
	}
}