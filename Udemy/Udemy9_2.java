package udemy;

import java.util.Stack;

public class Udemy9_2 {
	public static void main(String args[]){
		MyQueue<Character> q = new MyQueue<Character>();
		q.offer('1');
		q.offer('2');
		q.offer('3');
		
		System.out.println(q.poll());
		
	}
}



class MyQueue<T> {
    Stack<T> stack1;
    Stack<T> stack2;
    
    public MyQueue() {
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
    }
    
    public void offer(T element) {
    	stack1.push(element);
    }
    
    public T poll() {
    	if(stack2.isEmpty()){
    		while(!stack1.isEmpty()){
        		stack2.push(stack1.pop());
        	}
    	}
        return stack2.pop();
    }
    
    public int size() {
    	return stack1.size() + stack2.size();
    }
}