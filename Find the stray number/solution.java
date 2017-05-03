import java.util.Arrays;

class Solution {
  static int stray(int[] numbers) {
		Arrays.sort(numbers);
		
		//맨 앞일 때, 중간일 때, 맨 끝일 때
		for(int i=0; i<numbers.length; i++){
			if(i==0&&numbers[i]!=numbers[i+1]){
				return numbers[i];
			}else if(i != 0 && i != numbers.length-1 && numbers[i]!=numbers[i-1] && numbers[i] != numbers[i+1]){
				return numbers[i];
			}else if(i==numbers.length-1 && numbers[i] != numbers[i-1]){
				return numbers[i];
			}
		}
		return 0;
  }
}