package udemy;

import java.util.Stack;

public class Udemy8_4 {
	public static void main(String args[]) {
		MyStack s = new MyStack();
		System.out.println(s.min());
		s.push(3);
		s.push(1);
		s.push(7);
		s.push(5);
		System.out.println(s.min());
	}
}

class MyStack {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public MyStack() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	public void push(int newVal) {
		if (minStack.isEmpty() || newVal <= minStack.peek()) {
			minStack.push(newVal);
		}
		stack.push(newVal);
	}

	public int pop() {
		int val = stack.pop();
		if (!minStack.isEmpty() && val == minStack.peek()) {
			minStack.pop();
		}
		return val;
	}

	public int min() {
		if (minStack.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return minStack.peek();
	}
}