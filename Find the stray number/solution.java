import java.util.Arrays;

class Solution {
  static int stray(int[] numbers) {
		Arrays.sort(numbers);
		
		//�� ���� ��, �߰��� ��, �� ���� ��
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