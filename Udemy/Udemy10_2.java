package Udemy.Udemy10_2;

public class BinaryTreeHandler {
	public static boolean isBalanced(Node root){
		return isBalancedHelper(root) != -1;
	}
	
	private static int isBalancedHelper(Node n){
		if(n==null){
			return 0;
		}
		int l = isBalancedHelper(n.left);
		if(l==-1){
			return -1;
		}
		int r = isBalancedHelper(n.right);
		if(r==-1){
			return -1;
		}
		
		int diff = Math.abs(r-l);
		if(diff > 1){
			return -1;
		}
		return Math.max(l, r) + 1;
	}
}

class Node {
	int data;
	Node left;
	Node right;
	
	public Node(){}
	public Node(int n){
		data = n;
	}
	
	public Node(int n, Node l, Node r){
		data = n;
		left = l;
		right = r;
	}
}
//다시 이해할 것