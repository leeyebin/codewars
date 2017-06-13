package udemy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Udemy9_1 {
	public static void main(String args[]){
		Queue<String> q = new LinkedList<String>();
		Queue<String> q2;
		q.add("1");
		q.add("2");
		q.add("3");
		q.add("4");
		
		ReverseQueue<String> q1 = new ReverseQueue();
		 q2 = q1.reverse(q);
		 while(q2.size()>0){
			 System.out.println(q2.poll() + " ");
		 }
			
	
	}
}

class ReverseQueue<T> {
	private Stack<T> stack;
	ReverseQueue(){
		stack = new Stack<T>();
	}
	
    public Queue reverse(Queue<T> q){
    	while(q.size()>0){
    		stack.push(q.poll());
    	}
    	while(stack.size()>0){
    		q.offer(stack.pop());
    	}
    	
    	return q;
    }
}
