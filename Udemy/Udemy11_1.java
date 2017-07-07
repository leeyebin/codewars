import java.util.PriorityQueue;

public class Udemy11_1 {
	public static void main(String srgs[]){
		int[] num = {5,2,1,3,6,8};
		HeapSort.sort(num);
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i] + " ");
		}
	}
}

class HeapSort {
    public static void sort(int[] a) {
        PriorityQueue<Integer> q  = new PriorityQueue<Integer>();
        for(int n : a){ //nlogn
        	q.offer(n);
        }
        for(int k=0; k<a.length; k++){ //nlogn
        	a[k] = q.poll();
        }
    }
}
