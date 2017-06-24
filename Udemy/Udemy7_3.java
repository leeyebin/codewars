package Udemy.Udemy7_1;

import java.util.HashSet;

public class SingleLinkedList {
    private Node head;
    
    public void reverse(){
    	Node oldHead = head;
    	head = null;
    	
    	for(Node n=oldHead; n!=null; n=n.next){
    		addToHead(n.data);
    	}
    }

    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }
    
    public void removeFirst() {
        if(head == null){
        	throw new RuntimeException("nothing");
        }
        head = head.next;
    }
    
    @Override
    public String toString() {
        String str = "[ ";
        for(Node n = head; n!=null; n=n.next) {
            str += n.data;
            str += " ";
        }
        str += "]";
        return str;
    }
    
    public void removeDuplicates(){
    	HashSet<Integer> set = new HashSet<Integer>();
    	Node prev = null;
    	Node n = head;
    	
    	while(n!=null){
    		if(set.contains(n.data)){
    			prev.next = n.next;
    		}else{
    			set.add(n.data);
    			prev = n;
    		}
    		n = n.next;
    	}
    }
}

class Node {
	int data;
	Node next;

}