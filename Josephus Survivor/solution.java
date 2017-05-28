package codewars.JosephusSurvivor;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {

	public static void main(String[] args) {
				
		System.out.println(josephusSurvivor(11,19));

	}

	public static int josephusSurvivor(final int n, final int k) {
		List<Integer> arr = new ArrayList<Integer>();
		int point = 0;
		int temp = 0;;
		
		for(int i=1; i<=n; i++){
			arr.add(i);
		}
		
		while(arr.size()>1){
			temp = point + (k-1);
			
			while(temp>arr.size()-1){
				temp = temp-arr.size();
				point = temp;
			}
			point = temp;
			
			arr.remove(point);
		}
		
		
		
		return arr.get(0);
	}
	
	public static void print(List<Integer> arr){
		for(int i=0; i<arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
	}

}
