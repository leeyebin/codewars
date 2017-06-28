package Udemy.Udemy7_5;

import java.util.Stack;

public class MyList {
	private Node head;

    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

    public boolean isPalindrome() {
        Stack<Integer> s = new Stack<Integer>();
        Node n1 = head;
        
        while(n1!=null){
        	s.push(n1.data);
        	n1 = n1.next;
        }
        Node n2 = head;
        while(n2!=null){
        	if(s.peek()==n2.data){
        		s.pop();
        		n2 = n2.next;
        	}else{
        		n2 = n2.next;
        	}
        }
        if(s.isEmpty()){
        	return true;
        }
        return false;
    }
}

class Node {
	int data;
	Node next;

}