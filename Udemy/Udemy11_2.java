import java.util.PriorityQueue;

public class Top10 {
	private PriorityQueue<Integer> q = new PriorityQueue<Integer>();

	public void read(int n){
		if(q.size()<10){
			q.offer(n);
		}else{
			int tenth = q.peek(); //큐의 가장 작은 값
			if(n>tenth){ //비교 후
				q.poll(); //큐에서 작은 값을 꺼낸후
				q.offer(n); //n을 넣는다.
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
