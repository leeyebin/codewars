package Udemy.Udemy7_4;

public class MyList {
    private Node head;
    
    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }
    
    public Node kthToLast(int k){
    	if(k<0){
    		return null;
    	}
    	Node n1 = head;
    	Node n2 = head;
    	
    	for(int i=0; i<k; i++){
    		if(n2==null){
    			return null;
    		}
    		n2 = n2.next;
    	}
    	
    	while(n2.next != null){
    		n1 = n1.next;
    		n2 = n2.next;
    	}
    	
    	return n1;
    }
}

class Node {
	int data;
	Node next;

}