package Udemy.Udemy11_2;

import java.util.PriorityQueue;

public class Top10 {
	private PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	
	public void read(int n){
		if(q.size()<10){
			q.offer(n);
		}else{
			int tenth = q.peek();
			if(n>tenth){
				q.poll();
				q.offer(n);
			}
		}
	}
	
	public int[] getTop10(){
		int[] ret = new int[10];
		for(int i=q.size()-1; i>=0; i--){
			ret[i] = q.poll();
		}
		return ret;
		
	}

}
